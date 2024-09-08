# Use OpenJDK 1.8 as base image
FROM openjdk:8-jdk-alpine

# Set a working directory inside the container
WORKDIR /usr/dockerbuildrun

# Copy the source code into the container
COPY src/ /usr/dockerbuildrun/src/

# Compile the Java code
RUN javac src/main/java/com/advaya/dockerbuildrun/HelloWorld.java

# Use ENTRYPOINT to define the fixed part of the command and CMD for arguments
ENTRYPOINT ["java", "-cp", "src/main/java", "com.advaya.dockerbuildrun.HelloWorld"]

# CMD is where we pass arguments (default argument)
CMD ["Default Argument"]