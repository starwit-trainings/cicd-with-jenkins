Here, you can find example project for setting up CICD with Jenkins

https://github.com/starwit-trainings/spring-boot/tree/main/testexample
mvn -B archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4

# Practice
## Day 1

### Task 1 - Git Usage

1. Create a Branch with your name in it via GitHub
1. Clone project in your IDE
1. Checkout your branch
1. Add some Documentation
1. Create Pull Request
1. Review Pull Requests of your team member and approve
1. Merge pull request

Additional Task: Create a Jira ticket and do the same task again by using the branch creation ability of Jira. Hence, the branch and git commits are connected to the ticket

### 03-Dependency-Management: Task 2 - Maven Introduction

1. Install Prerequisites (Maven 3, JDK11 or higher)
1. Create your own Maven Project via archetype:
    ```
    mvn -B archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4
    ```
1. Check dependencies and plugins
1. See maven [livecycle phases and goals](https://medium.com/@yetanothersoftwareengineer/maven-lifecycle-phases-plugins-and-goals-25d8e33fa22#:~:text=Phases%20are%20the%20steps%20in,to%20building%20and%20managing%20project).
1. Try to execute your program and find out what is missing

Additional Task: Read Json file and add a personalized welcome message. E.G.

    ```
    {
        "name": "Flaschengeist",
        "message": "Herzlich willkommen"
    }
    ```
    Hint: use maven-assembly-plugin or maven-shade-plugin

## Day 2

### 05-Maven
### Task 3 - Maven with Subprojects

1. Go to Usermanagement
1. Execute mvn clean package
1. Execute `mvn dependency:tree`

### Task 4 - JUnit Testing & Reporting

1. Take a project of your choice and add a Unit test
1. Execute JUnit test in your IDE and with Maven
1. Create a failing Unit Test
1. execute `mvn site`
1. Go to target/surefire-reports and see Surefire results
1. Go to target/site and open html site in browser

maven-surefire-plugin
maven-surefire-report-plugin

### 06-STACC
### Task 5 - Jenkins Pipeline Execution

1. Add a "Hello World" Jenkins pipeline to your project
1. Execute pipeline and see results

### Task 6 - Jenkins Maven Execution

1. Add new Jenkins Pipeline for your project
1. Check maven and JDK Configurations

### Task 7 - Jenkins Unit Testing

1. Add Unit Testing to your pipeline

### Task 8 - Docker build

Build your project with docker
1. Create Dockerfile
1. Add Docker build to Jenkins Pipeline

## Day 3 




### Task 8 - CICD with Jira

### Addons

Addon: Jenkins build with Docker

## Kubernetes

* K3s Installation: https://docs.k3s.io/quick-start `curl -sfL https://get.k3s.io | sh -`
* keycloak helm chart: https://github.com/bitnami/charts/tree/main/bitnami/keycloak

## Docker Multi-Platform

* https://www.docker.com/blog/faster-multi-platform-builds-dockerfile-cross-compilation-guide/

* vue dockerize: https://v2.vuejs.org/v2/cookbook/dockerize-vuejs-app.html