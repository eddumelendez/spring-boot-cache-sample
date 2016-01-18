echo "Empezando mi workflow"

stage 'build'
node {
    
    echo "Descargando fuentes"
    git 'https://github.com/eddumelendez/spring-boot-cache-sample.git'
    
    echo "Construyendo el proyecto con Gradle Wrapper"
    sh './gradlew build -x test'   
    
    archive 'build/libs/*.jar'
    
}

stage 'test'
node {
    sh './gradlew test'
    
    step([$class: 'JUnitResultArchiver', testResults: '**/build/test-results/TEST-*.xml'])
}

stage 'integration-test'
node {
    def outcome = input message: 'Ejecutar Test de Integración?', parameters: [
        [name: 'Ejecutar', description: 'Permite la ejecución de los test de integración.', $class: 'BooleanParameterDefinition']
    ]
    if (outcome) {
        sh './gradlew integrationTest'
    }
}
