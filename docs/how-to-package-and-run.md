# 🤷🏻‍♂️ How to package and run?

This project uses Quarkus, the Supersonic Subatomic Java Framework.

## ▶ Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only
> at http://localhost:8080/q/dev/.

## 📦 Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `application/target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into
the `application/target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar application/target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar application/target/*-runner.jar`.

Or, follow the steps of [Dockerfile.jvm](https://github.com/lionelgt/java-hexagonal-ddd-quarkus-skeleton/blob/main/docker/Dockerfile.jvm) / [Dockerfile.legacy-jar](https://github.com/lionelgt/java-hexagonal-ddd-quarkus-skeleton/blob/main/docker/Dockerfile.legacy-jar) build and run in **JVM mode**.


## ⚙️ Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container
using:

```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./application/target/demo-1.0-SNAPSHOT-runner`

Or, follow the steps of [Dockerfile.native](https://github.com/lionelgt/java-hexagonal-ddd-quarkus-skeleton/blob/main/docker/Dockerfile.native) / [Dockerfile.native-micro](https://github.com/lionelgt/java-hexagonal-ddd-quarkus-skeleton/blob/main/docker/Dockerfile.native-micro) build and run in **native mode**.

## 🤼 JVM vs Native image sizes

![JVM vs Native](https://raw.githubusercontent.com/lionelgt/java-hexagonal-ddd-quarkus-skeleton/main/docs/img/jvm-vs-native-image-sizes.png)
