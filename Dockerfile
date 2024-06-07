FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY build/libs/*.jar forbys.jar
COPY .env .env

EXPOSE 8080
EXPOSE 5005

CMD ["sh", "-c", "java ${JAVA_OPTS} -jar -Dspring.profiles.active=${SPRING_PROFILES_ACTIVE} forbys.jar"]