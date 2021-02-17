FROM gradle:6.8-jdk11-openj9

EXPOSE 8080

WORKDIR /home/gradle/project

CMD ["gradle", "bootRun"]
