@echo off
mvnw clean package

docker-compose down
docker-compose up -d --build
docker-compose attach client1