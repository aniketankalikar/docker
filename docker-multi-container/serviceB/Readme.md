docker network create my-custom-network
mvn clean install
docker build -t service-b-image .
docker run --rm  -d --name service-b-container --network my-custom-network -p 8082:8080 service-b-image
http://localhost:8082/serviceB/hello