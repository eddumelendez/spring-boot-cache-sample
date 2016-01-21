echo "Empezando mi workflow"

stage 'build'
node {

    echo "Descargando fuentes"
    git 'https://github.com/eddumelendez/spring-boot-cache-sample.git'

    echo "Construyendo el proyecto con Gradle Wrapper"
    bat './gradlew build -x test'

    archive 'build/libs/*.jar'

}

stage 'test'
node {
    bat './gradlew clean test'

    step([$class: 'JUnitResultArchiver', testResults: '**/build/test-results/TEST-*.xml'])
}

stage 'integration-test'
node {
    def outcome = input message: 'Quieres ejecutar los test de integración?', parameters: [[$class: 'BooleanParameterDefinition', defaultValue: false, description: '', name: '']]
    if (outcome) {
        bat './gradlew integrationTest'
    }
}
