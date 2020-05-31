FROM openjdk:8-jdk-alpine
MAINTAINER "yangbing@ipaynow.cn"
COPY ./target/boot-redis.jar /tmp/app.jar
WORKDIR /tmp
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]