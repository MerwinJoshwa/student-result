
# Stage 1: Build the Java application
FROM maven:3.9-eclipse-temurin-21 AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package

# Stage 2: Run the application
FROM eclipse-temurin:21-jre

WORKDIR /app

COPY --from=build /app/target/classes ./classes

CMD ["java", "-cp", "classes", "main.java.StudentResult"]

