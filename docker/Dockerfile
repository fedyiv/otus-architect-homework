FROM alpine:3.12
RUN apk update && apk upgrade
RUN apk add openjdk11
COPY app.jar /
ENV JAVA_HOME=/usr/lib/jvm/java-11-openjdk/
ENV PATH="${JAVA_HOME}bin:${PATH}"
CMD ["java", "-jar", "/app.jar"]