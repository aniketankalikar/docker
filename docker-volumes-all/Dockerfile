#Use an official openjdk runtime as parent image
FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/docker-volumes-all-0.0.1-SNAPSHOT.jar /app/demo.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app/demo.jar"]