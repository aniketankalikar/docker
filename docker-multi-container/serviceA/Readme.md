docker network create my-custom-network
mvn clean install
docker build -t service-a-image .
docker run --rm  -d --name service-a-container --network my-custom-network -p 8081:8080 service-a-image
http://localhost:8081/serviceA/hello