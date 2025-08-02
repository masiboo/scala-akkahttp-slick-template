FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/todo-1.0.0.jar /app/server.jar
EXPOSE 8080
CMD ["java", "-jar", "/app/server.jar"]