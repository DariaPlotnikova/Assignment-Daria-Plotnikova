FROM java:8
COPY hello-docker.java /
RUN javac hello-docker.java
EXPOSE 8080
ENTRYPOINT ["java"]
CMD ["HelloDocker"]
