# CI-CD-Pipeline 
This is a Spring Boot Application, with Jenkins pipeline, for creating a full CI/CD flow using docker too.

# Jenkins 
Jenkins is an open source automation server. It helps automate the parts of software development related to building, testing, and deploying, facilitating continuous integration and continuous delivery.
 
# Docker 
Docker is a set of platform as a service products that use OS-level virtualization to deliver software in packages called containers.

# Using Jenkins with Docker
First of all to use jenkins with docker, we will have to know that as we are running Jenkins inside a docker container, and we need access to docker to
build our services images, so first of all let's build a Jenkins image with docker installed inside it. Let's check the dockerfile to 
build this Jenkins image with docker inside, you will just have to put this file into any folder, and run the docker build command.

# Dockerfile for Jenkins
```
from jenkins/jenkins:lts
USER root
RUN apt-get update -qq \
    && apt-get install -qqy apt-transport-https ca-certificates curl gnupg2 software-properties-common
RUN curl -fsSL https://download.docker.com/linux/debian/gpg | apt-key add -
RUN add-apt-repository \
   "deb [arch=amd64] https://download.docker.com/linux/debian \
   $(lsb_release -cs) \
   stable"
RUN apt-get update  -qq \
    && apt-get install docker-ce=17.12.1~ce-0~debian -y
RUN usermod -aG docker jenkins
```

Just place this Dockerfile in any folder and run the following commands:

$ docker image build -t jenkins-docker .

Now that the docker image has already been built, we can run the Jenkins in a docker container with the command:

$ docker container run -d -p 8080:8080 -v /var/run/docker.sock:/var/run/docker.sock jenkins-docker

# Building Spring Boot Application
The Sample application built here has the maven jar plugin, so in order to build that as a jar, we just have to do the command:

$ mvn clean install

# Using with AWS ECS and ECR

To begin with, you must submit your image to Amazon ECR through command line interface, which requires that you have the aws cli installed on your machine. Following that, we must use the command: to synchronise the docker login with the Amazon account.

$(aws ecr get-login --no-include-email --region $AWS_DEFAULT_REGION)

Following that, you may develop and push your image after syncing the two accounts. Just create the illustration:
$ docker build -t devops-service . 

Tag you image:

$ docker tag devops-service:latest $AWS_IAM_USER_ID.dkr.ecr.$AWS_DEFAULT_REGION.amazonaws.com/devops-service:latest

Finally run this command for pushing the image:

docker push $AWS_IAM_USER_ID.dkr.ecr.$AWS_DEFAULT_REGION.amazonaws.com/devops-service:latest



#Sceenshots

The Project display after creating :-
![1](https://user-images.githubusercontent.com/74751196/235208025-1e2ab0f5-9f95-4018-96c9-957c4ed0c957.png)

You need to add all the required connections and credentials of github and your database :-

![2](https://user-images.githubusercontent.com/74751196/235208046-94fd5f28-c4cb-4c98-b998-6d6361db686a.png)

console after building the project  :-
![3](https://user-images.githubusercontent.com/74751196/235208067-af992f90-2afc-4d65-bf22-70f8e9666e1a.png)
![4](https://user-images.githubusercontent.com/74751196/235208082-1dc0238b-f24d-496e-b98d-db4fb181543e.png)

Displayed content after building the project in jenkins successfully :-

![5](https://user-images.githubusercontent.com/74751196/235208105-d7acbb3d-30ff-49c7-a999-0047cfa02408.png)

Deployed the war file in Tomcat Server using jenkins

![6](https://github.com/rock-man-ctrl/CI-CD-Pipeline/blob/main/Screenshots/Screenshot%20(32).png?raw=true)


Step for CI/CD Integration :-
![7](https://github.com/rock-man-ctrl/CI-CD-Pipeline/blob/main/Screenshots/Screenshot%20(36).png?raw=true)

#PostMan
Getting all the Servers
![Screenshot (30)](https://user-images.githubusercontent.com/74751196/235208140-a5829954-19e0-4080-ac33-0512308a9d58.png)

Getting a desired Server using a particular ID
![Screenshot (31)](https://user-images.githubusercontent.com/74751196/235208167-47af6d4f-8b02-4275-8fb3-336a7e77ab77.png)

creating server
![Screenshot (33)](https://user-images.githubusercontent.com/74751196/235208220-b91c2e20-7bcf-4714-9df4-15a440b962ab.png)

deleting Server
![Screenshot (34)](https://user-images.githubusercontent.com/74751196/235208244-0dae6d98-b53c-4388-8079-59b444a4a4ee.png)

Updated Server after Deleting
![Screenshot (35)](https://user-images.githubusercontent.com/74751196/235208260-36471909-4911-4452-b6ef-345a28864cd8.png)
