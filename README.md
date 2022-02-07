# SortManagerProject

## Table of Contents
* Summary
* Dependencies
* Set up and Usage
  1. How to Set up
  2. How to Use
* Phases of the project
* Testing of the project
##Summary
A java based program that allows the user to sort an Array using three different sorting algorithms. The project has been created and structured following the MVC pattern (**Model, View, Controller**). Additionally, Testing classes have been included for the different sorting algorithms  

##Dependencies
* Log42j --2.17.1
* JUnit --5.8.2
```xml
<dependencies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.8.2</version>
        </dependency>
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-core</artifactId>
            <version>2.17.1</version>
        </dependency>
    </dependencies>
```

##Set up and Usage

###How to Set up

* Download or clone the git repository. If downloaded, extract files in a folder.
* Open the project in the IDE you desire, we will make use of IntelliJ in this example.
* In the project left menu, go to pom.xml file to add the required dependencies to the project clicking the refresh Maeven .
![alt text](https://github.com/djucacupueran/SortManagerProject/blob/main/Images/Screenshot%202022-02-07%20082302.png?raw=true)


##How to Use
1. Go to the project in your IDE
2. Run FactoryMain.java file
3. Input a number to select between the different sorting options (**BST, BubbleSort, MergeSort**)
4. 
5. Input a number to select the size of the random array that will be created.
6. Results will appear in the console box showing original and sorted arrays and execution time.



