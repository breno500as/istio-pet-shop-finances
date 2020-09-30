FROM openjdk:11-jdk-slim
COPY target/pet-shop-finances-exec.jar app.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]