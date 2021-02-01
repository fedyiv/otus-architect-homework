# Build services
./gradlew clean UserService:bootJar OrderService:bootJar

# Create docker image
rm -rf docker/build
mkdir docker/build
cp services/UserService/build/libs/UserService.jar docker/build
cp services/OrderService/build/libs/OrderService.jar docker/build

docker build ./docker/build -t fedyiv/otus_architect_homework_6_user_service:v1 -f docker/Dockerfile-UserService
docker push fedyiv/otus_architect_homework_6_user_service:v1

docker build ./docker/build -t fedyiv/otus_architect_homework_6_order_service:v1 -f docker/Dockerfile-OrderService
docker push fedyiv/otus_architect_homework_6_order_service:v1