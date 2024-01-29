FROM openjdk:21-jdk


WORKDIR /app


COPY mvnw .
COPY .mvn .mvn


COPY pom.xml .
COPY src src


RUN ./mvnw package -DskipTests -e


CMD ["java", "-jar", "target/spring_mysql_api-0.0.1-SNAPSHOT.jar"]