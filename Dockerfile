FROM maven:latest

WORKDIR /fahrToCel

COPY pom.xml /fahrToCel/

COPY . /fahrToCel/

RUN mvn package

CMD ["java", "-jar", "target/interconversions.jar"]