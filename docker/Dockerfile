FROM alpine:3.12
RUN apk update && apk upgrade
RUN apk add openjdk11
COPY otus-architect-homework-1.0-SNAPSHOT.jar /
ENV JAVA_HOME=/usr/lib/jvm/java-11-openjdk/
ENV PATH="${JAVA_HOME}bin:${PATH}"
CMD ["java", "-jar", "/otus-architect-homework-1.0-SNAPSHOT.jar"]