FROM openjdk:8-jdk-alpine
EXPOSE 8080
RUN addgroup -S spring && adduser -S spring -G spring
RUN apk --no-cache add curl
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]