FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/mongodb_curd_operations-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]

EXPOSE 2222
