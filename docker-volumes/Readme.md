Anonymous volume

docker run -d -p 8080:8080 -v /mnt/data docker-volume-demo

Named Volumes

docker volume create volumes-demo
docker run -d -p 8080:8080 -v volumes-demo:/mnt/data docker-volume-demo

mkdir -p /path/to/demo-data
echo "Data from bind mount" > /path/to/demo-data/demo.txt

docker run -d -p 8080:8080 -v /path/to/demo-data:/mnt/data docker-volume-demo