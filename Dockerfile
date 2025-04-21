ARG JDK11
FROM ${JDK11}
EXPOSE 8085
ADD target/app.jar app.jar

ENTRYPOINT java ${JAVA_OPTS} -jar /app.jar