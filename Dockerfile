FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

#ENV JAVA_OPTS=""

COPY build/libs/*.jar forbys.jar
COPY .env .env

#ENTRYPOINT ["java", "${JAVA_OPTS} -jar", "/app/forbys.jar"]
EXPOSE 8080
EXPOSE 5005

CMD ["sh", "-c", "java ${JAVA_OPTS} -jar forbys.jar"]