## Init

To initialise run the following command or such format 

```
mvn archetype:generate -DgroupdId=com.seek -DartifactId=seek-selenium-java -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4
```

Where

**-DgroupId** represents the site or app in question in the format of **com.site-name** or **com.app-name.app** 
**-DartifactId** the name of the file / project root in question
**DarchetypeArtifactId** no friggin idea what this is
**-DarchetypeVersion** no quite sure either


For reference see the [maven init reference](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)

Your dir structure will be as follows:

my-app

|-- pom.xml

`-- src

    |-- main

    |   `-- java

    |       `-- com

    |           `-- mycompany

    |               `-- app

    |                   `-- App.java

    `-- test

        `-- java

            `-- com

                `-- mycompany

                    `-- app

                        `-- AppTest.java

Main is the source code, test is the test location. Our concern is with the test location here.

## Linking To Git Repo

Maven initialises the project for you and it's root dir, so linking it to a git repo requires the following steps:

```
1. Create project in the github site, without a readme preferably
2. run 'git init' via command line
3. run 'git remote add origin $ssh-address' which you will have copied from github website
4. run 'git add, git commit, git push' as per normal
```