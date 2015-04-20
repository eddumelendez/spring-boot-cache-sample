project {
  modelVersion '4.0.0'
  parent {
    groupId 'org.springframework.boot'
    artifactId 'spring-boot-starter-parent'
    version '1.3.0.BUILD-SNAPSHOT'
  }
  groupId 'io.eddumelendez'
  artifactId 'spring-boot-cache-demo'
  version '0.0.1-SNAPSHOT'
  packaging 'war'
  name 'spring-boot-cache-demo'
  description 'Demo project for Spring Boot'

  properties {
    'java.version' '1.8'
    'project.build.sourceEncoding' 'UTF-8'
    'start-class' 'io.eddumelendez.Application'
  }

  dependencies {
    dependency('org.springframework.boot:spring-boot-starter-actuator')
    dependency("org.springframework.boot:spring-boot-starter-web")
    dependency("org.springframework:spring-context-support")
    dependency("javax.cache:cache-api")
    dependency("com.hazelcast:hazelcast")
    dependency("com.hazelcast:hazelcast-spring")
    dependency("com.google.guava:guava:18.0")
    dependency("net.sf.ehcache:ehcache")
    dependency("org.springframework.boot:spring-boot-starter-redis")
    dependency {
      groupId 'org.springframework.boot'
      artifactId 'spring-boot-starter-test'
      scope 'test'
    }
  }

  repositories {
    repository {
      id 'spring-snapshots'
      name 'Spring Snapshots'
      url 'https://repo.spring.io/snapshot'
    }
    repository {
      id 'spring-milestones'
      name 'Spring Milestones'
      url 'https://repo.spring.io/milestone'
    }
  }

  build {
    plugins {
      plugin {
        groupId 'org.springframework.boot'
        artifactId 'spring-boot-maven-plugin'
      }
    }
  }

  pluginRepositories {
    pluginRepository {
      id 'spring-snapshots'
      name 'Spring Snapshots'
      url 'https://repo.spring.io/snapshot'
    }
    pluginRepository {
      id 'spring-milestones'
      name 'Spring Milestones'
      url 'https://repo.spring.io/milestone'
    }
  }
}
