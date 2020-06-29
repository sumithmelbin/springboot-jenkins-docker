FROM openjdk:8
EXPOSE 8090
ADD target/springboot-jenkins-docker.jar springboot-jenkins-docker.jar
ENTRYPOINT ["java","-jar","/springboot-jenkins-docker.jar"]