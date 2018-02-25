FROM openjdk:8-jre-alpine

#change the default filename to a variable
COPY ./target/hellow-0.0.1-SNAPSHOT.jar /usr/src/hellow/
WORKDIR /usr/src/hellow
#change the default port
EXPOSE 8081
#change the default filename to a variable
CMD ["java", "-jar", "hellow-0.0.1-SNAPSHOT.jar"]
