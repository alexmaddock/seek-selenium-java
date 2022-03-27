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

The starting class path in this structure is after test/java, so with TestNG if you need to reference the classpath in the class name for below

```
<suite name="Example test run">
  <test name="Simple Test">
    <classes>
      <class name="${ClassName}"/>
    </classes>
  </test>
</suite>
```

You have to pass in something like

`
<class name="com.mycompany.app.AppTest"/>
`

Skipping the .java extension since it runs from the compiled `/target` dir that is generated in the compile step. 


For this dir structure it is as follows (for now)

`
<class name="1.HelloBrowserTest"/>


## Linking To Git Repo


Maven initialises the project for you and it's root dir, so linking it to a git repo requires the following steps... or just follow [this guide](https://kbroman.org/github_tutorial/pages/init.html)


```
1. Create project in the github site, without a readme preferably
2. run 'git init' via command line
3. run 'git remote add origin $ssh-address' which you will have copied from github website
4. run 'git add, git commit, git push' as per normal
5. You may need to track branches with 'git push --set-upstream origin master' to start
```

## Adding Dependencies

You can add dependencies by searching the Maven site for the latest relevant versions, but they should have this format

```
<dependency>
  <groupId>org.seleniumhq.selenium</groupId>
  <artifactId>selenium-java</artifactId>
  <version>4.0.0</version>
</dependency>
```

To run this you need to do

`mvn dependency:resolve` 

OR

`mvn install`

## Running Code

Best to run `mvn clean` to start, so that the /target dir gets cleaned out from the root. This is a part of gitignore regardless so wont be an issue when it comes to source control.

Compile 

`mvn compile`

Test

`mvn test`

## API Related Packages / Libs

Using RestAssured it is recommended to do static imports. This may be a good clue to implementing readable and clean Java code with the Page Object Model in use (up for review - see [import-static-class](https://www.javatpoint.com/why-we-use-static-class-in-java)).

https://github.com/rest-assured/rest-assured/wiki/GettingStarted

## Niggles

Some current niggles. 

#### ChromeDriver

This was outdates for the packages in use for this project and was bumped to version 99 or so. 
Currently the binary is self managed outside of an install manager and on my mac is located at 
`/usr/bin/local/bin/chromedriver` but ran into some zsh issues documented here when trying to run the install process.

[compdef-issue](https://apple.stackexchange.com/questions/296477/my-command-line-says-complete13-command-not-found-compdef)

Seems the solution is to update nvm or something...

