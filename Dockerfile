FROM java
COPY target/*.jar demo1-0.0.1-SNAPSHOT.jar
RUN bash -c 'touch ./demo1-0.0.1-SNAPSHOT.jar'
EXPOSE 8080
CMD ["java","-jar","demo1-0.0.1-SNAPSHOT.jar"]