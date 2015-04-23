spring-boot-cache
=================

* Generic

maven:
```
mvnw spring-boot:run
```

gradle:
```
gradlew bootRun
```

* EhCache

maven:
```
mvnw spring-boot:run -Dspring.profiles.active=ehcache
```

gradle:
```
SPRING_PROFILES_ACTIVE=ehcache gradlew bootRun
```

* Guava

maven:
```
mvnw spring-boot:run -Dspring.profiles.active=guava
```

gradle:
```
SPRING_PROFILES_ACTIVE=guava gradlew bootRun
```

* Hazelcast

maven:
```
mvnw spring-boot:run -Dspring.profiles.active=hazelcast
```

gradle:
```
SPRING_PROFILES_ACTIVE=hazelcast gradlew bootRun
```

* JCache

maven:
```
mvnw spring-boot:run -Dspring.profiles.active=jcache
```

gradle:
```
SPRING_PROFILES_ACTIVE=jcache gradlew bootRun
```

* Redis

Redis instance is needed:

```
docker run --name redis -d redis
```

maven:
```
mvnw spring-boot:run -Dspring.profiles.active=redis
```

gradle:
```
SPRING_PROFILES_ACTIVE=redis gradlew bootRun
```

* Simple

maven:
```
mvnw spring-boot:run -Dspring.profiles.active=simple
```

gradle:
```
SPRING_PROFILES_ACTIVE=simple gradlew bootRun
```
