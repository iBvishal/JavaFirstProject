#JavaFirstProject

1. Create a folder named JavaFirstProject using following commands
```
$ mkdir JavaFirstProject
$ cd JavaFirstProject
```
2. Creating a base package com.sapient.week1
```
$ mvn archetype:generate -DgroupId=com.sapient.week1 -DartifactId=JavaFirstProject -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```
3. Write the code in App.java and its test code in AppTest.java.
4. cd till the root project folder and run the following command
```
mvn clean install
```
5. If the biuld is sucessfull then run the following command
```
jar -tf JavaFirstProject-1.0-SNAPSHOT.jar
~~~