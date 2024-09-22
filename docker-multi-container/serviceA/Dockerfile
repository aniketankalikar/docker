FROM openjdk:17-jdk-slim
COPY target/serviceA-0.0.1-SNAPSHOT.jar service-a.jar
ENTRYPOINT ["java","-jar","service-a.jar"]