FROM java:8
VOLUME /tmp
ADD docker-deploy.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]