# Build the app
./gradlew clean app:bootJar

# Create docker image
rm -rf docker/build
mkdir docker/build
cp app/build/libs/app.jar docker/build

docker build ./docker/build -t fedyiv/otus_architect_homework_2:v1 -f docker/Dockerfile
docker rm otus_architect_homework_2
docker run -d -p 8080:8080 --name otus_architect_homework_2   fedyiv/otus_architect_homework_2:v1
docker push fedyiv/otus_architect_homework_2:v1