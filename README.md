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
4. Input a number to select the size of the random array that will be created.

![alt text](https://github.com/djucacupueran/SortManagerProject/blob/main/Images/Screenshot%202022-02-07%20083433.png?raw=true)
5. Results will appear in the console box showing original and sorted arrays and execution time.

![alt text](https://github.com/djucacupueran/SortManagerProject/blob/main/Images/Screenshot%202022-02-07%20083354.png?raw=true)


## Phases of the project
###Phase 1
Project has been created at this phase as well as **Bubble** and **Merge** sorting algorithms. JUnit tests have been implemented to ensure the functionality of them
###Phase 2
MVC architecture has been implemented at this stage, organizing files into Model, View and Controller folders and creating required classes.
Factory pattern implemented and Sorting interface as well.
###Phase 3
Logger has been added to the project making use of log4j included in this project. This allows us to keep track of users activity during the usage of the program for further analysis.
###Phase 4
Binary Search tree class for sorting arrays has been added to the Model making use of the sort interface. Required tests has been included and new option to select it.
###Phase 5
Execution time calculation has been added to the program, sending it to the logger and printing it to the users console.

##Testing of the project
Different tests have been included to test the different sorting algorithms making use of JUnit.
Among the tests null check arrays have been tested as well as repeated values or 1 element arrays.
![alt text](https://github.com/djucacupueran/SortManagerProject/blob/main/Images/Screenshot%202022-02-07%20084707.png?raw=true)

Different classes and interfaces of the program have been manually tested to ensure proper functionality.

