# Use JDK 17 as base image
FROM openjdk:17-alpine

# Set working directory
WORKDIR /app

COPY target/docker-rest-application-0.0.1-SNAPSHOT.jar /app/docker-rest-application.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app/docker-rest-application.jar"]