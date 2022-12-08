FROM alpine:latest
COPY pom.xml /tmp
COPY src /tmp/src
WORKDIR /tmp
RUN apk update && \
    apk add openjdk11 \
            maven && \
    mvn package

ENTRYPOINT [ "mvn","spring-boot:run" ]