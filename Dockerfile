FROM openjdk:17-oracle
COPY ./target/trainerservice-0.0.1-SNAPSHOT.jar trainerservice.jar
CMD ["java","-jar","trainerservice.jar"]