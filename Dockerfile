FROM amd64/amazoncorretto:18-alpine
EXPOSE 8080
ADD target/ecs-demo-0.0.1-SNAPSHOT.jar ecs-demo.jar
ENTRYPOINT ["java","-jar", "/ecs-demo.jar"]
