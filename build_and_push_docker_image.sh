# Build the app
./gradlew clean :bootJar

# Create docker image
rm -rf docker/build
mkdir docker/build
cp build/libs/otus-architect-homework-1.0-SNAPSHOT.jar docker/build

docker build ./docker/build -t fedyiv/otus_architect_homework_1:v2 -f docker/Dockerfile
docker rm otus_architect_homework_1
#docker run -d -p 8080:8080 --name otus_architect_homework_1   otus_architect_homework_1
docker push fedyiv/otus_architect_homework_1:v2