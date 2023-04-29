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



#Process of The Project Creation
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
