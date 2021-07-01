FROM ubuntu
RUN apt update
RUN apt -y install default-jdk
WORKDIR /home/myapp
COPY HelloWorld.java ./
RUN javac HelloWorld.java
RUN java HelloWorld
