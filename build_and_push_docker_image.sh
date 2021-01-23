# Build the app
./gradlew clean app:bootJar

# Create docker image
rm -rf docker/build
mkdir docker/build
cp app/build/libs/app.jar docker/build

docker build ./docker/build -t fedyiv/otus_architect_homework_5:v2 -f docker/Dockerfile
#docker rm otus_architect_homework_5
##docker run -d -p 8080:8080 --name otus_architect_homework_3   fedyiv/otus_architect_homework_3:v1
docker push fedyiv/otus_architect_homework_5:v2