#Use the official java image as the parent image
FROM openjdk:17-jdk-slim

#Set the working directory in the container
WORKDIR /app

#Copy the current directory contents into the container at /app
COPY target/docker-volumes-0.0.1-SNAPSHOT.jar /app/docker-volumes.jar

#mAKE THE port available outside the container
EXPOSE 8080

#Run the application
ENTRYPOINT ["java","-jar","docker-volumes.jar"]