FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-k8s-app.jar spring-boot-k8s-app.jar
ENTRYPOINT ["java","-jar","/spring-boot-k8s-app.jar"]