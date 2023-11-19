FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/GoSecurity-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} go-security.jar
ENTRYPOINT ["java","-jar","/go-security.jar"]