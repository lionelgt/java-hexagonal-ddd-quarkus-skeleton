# 🏎️💨 ♨️ 🚀 Java Hexagonal Architecture + DDD, with Quarkus: Template repository for your new cloud native java projects.

<img src="https://avatars.githubusercontent.com/u/47638783?s=200&v=4"  align="left" width="210px" height="210px">
<img align="left" width="0" height="210px" hspace="10"/>

> ⚡ Start your **cloud native** java projects as fast as possible.
  
> 🚀 Minimal footprint Java applications optimal for running in containers or serverless.

> 🎯 Start with a software architecture that isolates the domain from external components.

> 🔥 Get started with software architecture that promotes maintainable, scalable, and high-quality software design.

[![Lionelgt](https://img.shields.io/badge/Lionel_gt-LinkedIn-blue.svg)](https://www.linkedin.com/in/lionelgt/)

## 👨🏼‍💻️️ Content
- [Introduction](#-introduction)
- [Dependencies](#-dependencies)
- [How to start](#-how-to-start)
- [How to package and run?](https://github.com/lionelgt/java-hexagonal-ddd-quarkus-skeleton/blob/main/docs/how-to-package-and-run.md)
- [Software architecture diagram](https://github.com/lionelgt/java-hexagonal-ddd-skeleton/blob/main/docs/software-architecture-diagram.md)
- [Related repositories](#-related-repositories)

## ℹ️️ Introduction

This skeleton repository was built to serve as a starting point for building a java **cloud native** project that implements Hexagonal Architecture + Domain-Driven Design (DDD).

As a example I included an API that covers all the layers to show the implementation in each of them.

## 🔧️ Dependencies

- [Java 21](https://www.oracle.com/java/technologies/downloads/#java21)
- [Quarkus 3.9.3](https://quarkus.io/)
- [Maven 3.9.4](https://maven.apache.org/docs/3.9.4/release-notes.html)

## 🚀 How to Start
1. Create your repository from this [java-hexagonal-ddd-quarkus-skeleton](https://github.com/lionelgt/java-hexagonal-ddd-quarkus-skeleton) repository. [Follow these steps](https://docs.github.com/en/repositories/creating-and-managing-repositories/creating-a-repository-from-a-template).
2. Clone your repository: `git clone https://github.com/:your-user/:your-repository-name`.
3. Create a native executable using:  `mvn clean package -Dnative -Dquarkus.native.container-build=true`
4. Build the image with: `docker build -f docker/Dockerfile.native-micro -t quarkus/java-hexagonal-ddd-quarkus-skeleton-native-micro .`
5. Execute this to run the container: `docker run -i --rm -p 8080:8080 quarkus/java-hexagonal-ddd-quarkus-skeleton-native-micro`
6. In order to check everything is OK : `curl 'localhost:8080/api/git-repository'`
    ```json
   {
       "name": "java-hexagonal-ddd-quarkus-skeleton",
       "full_name": "lionelgt/java-hexagonal-ddd-quarkus-skeleton",
       "owner": {
           "login": "lionelgt",
           "url": "https://api.github.com/users/lionelgt"
       }
   }
   ```
7. **Start developing!**

## 💡 Related repositories

### ☕ Java

- [♨ ☕ 🚀 Java Hexagonal Architecture + DDD: Skeleton repository for your new java projects](https://github.com/lionelgt/java-hexagonal-ddd-skeleton)
- [♨ ☕ 🚀 Java *Reactive*, Hexagonal Architecture + DDD: Template repository for your new java *reactive* projects](https://github.com/lionelgt/java-hexagonal-ddd-reactive-skeleton)

### ✨ Javascript

- [✨🐢🚀✨ Node.js Hexagonal Architecture + DDD: Template repository for your Node.js projects, designed for microservices](https://github.com/lionelgt/nodejs-hexagonal-ddd-skeleton)
