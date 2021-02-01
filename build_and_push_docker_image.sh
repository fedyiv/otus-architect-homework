# Build the User Service
./gradlew clean UserService:bootJar

# Create docker image
rm -rf docker/build
mkdir docker/build
cp UserService/build/libs/UserService.jar docker/build

docker build ./docker/build -t fedyiv/otus_architect_homework_6_user_service:v1 -f docker/Dockerfile-UserService
#docker rm otus_architect_homework_5
##docker run -d -p 8080:8080 --name otus_architect_homework_3   fedyiv/otus_architect_homework_3:v1
docker push fedyiv/otus_architect_homework_6_user_service:v1

# Build the Order Service
./gradlew clean OrderService:bootJar

# Create docker image
rm -rf docker/build
mkdir docker/build
cp OrderService/build/libs/OrderService.jar docker/build

docker build ./docker/build -t fedyiv/otus_architect_homework_6_order_service:v1 -f docker/Dockerfile-OrderService
#docker rm otus_architect_homework_5
##docker run -d -p 8080:8080 --name otus_architect_homework_3   fedyiv/otus_architect_homework_3:v1
docker push fedyiv/otus_architect_homework_6_order_service:v1