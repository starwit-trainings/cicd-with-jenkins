Here, you can find example project for setting up CICD with Jenkins

https://github.com/starwit-trainings/spring-boot/tree/main/testexample
mvn -B archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4

# Day 1

## Task 1 - Git Usage

1. Create a Branch with your name in it via GitHub
1. Clone project in your IDE
1. Checkout your branch
1. Add some Documentation
1. Create Pull Request
1. Review Pull Requests of your team member and approve
1. Merge pull request

Additional Task: Create a Jira ticket and do the same task again by using the branch creation ability of Jira. Hence, the branch and git commits are connected to the ticket

## Task 2 - Maven Introduction

1. Install Prerequisites (Maven 3, JDK11 or higher)
1. Create your own Maven Project via archetype:
    ```
    mvn -B archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4
    ```
1. Check dependencies and plugins
1. See maven livecycle phases and goals: https://medium.com/@yetanothersoftwareengineer/maven-lifecycle-phases-plugins-and-goals-25d8e33fa22#:~:text=Phases%20are%20the%20steps%20in,to%20building%20and%20managing%20project.
1. Try to execute your program and find out what is missing

Additional Task: Read Json file and add a personalized welcome message.

    ```
    {
        "name": "Anett",
        "message": "Herzlich willkommen"
    }
    ```


