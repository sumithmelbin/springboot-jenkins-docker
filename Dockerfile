FROM openjdk:8-jdk-alpine
EXPOSE 8090
ADD target/springboot-jenkins-docker-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]