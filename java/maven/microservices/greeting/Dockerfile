FROM java:8
ADD target/greeting.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8765
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
