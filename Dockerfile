FROM openjdk:21-jdk-slim
COPY cyrusdemo.jar /cyrusdemo.jar
CMD ["java", "-jar", "/cyrusdemo.jar"]