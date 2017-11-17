Test Data for the Weather Prediction
========================

It is a package for generation the example data for weather prediction. It develop with java 1.7 on Eclipse with MacOs 10.10.x
A nested HashMap is used to store items in this model because the  time complexity for look up and insert a HashMap is O(1) if there is not a hash collision. The Arrays<> is good solution to replace this hashMap if the number of item is defined.

The algorithms in this application are reference some research papers in following

[1] Harry Boyer, François Garde, Jean Claude Gatina, Jean Brau:
    A multimodel approach to building thermal simulation for design and research purposes. CoRR abs/1212.5262 (2012)

[2] Laetitia Adelard, Harry Boyer, F. Garde, Jean Claude Gatina:
    Detailed weather data generator for building simulations. CoRR abs/1212.3930 (2012)

[3] L. O. Degelman, A Weather simulation model for Building Analysis ASHRAE Trans., Symposium on Weather Data, Seattle, WA,435-447 (1995)

[4] L. O. Degelman, A statistically -based hourly weather data generator for driving energy simulation and equipment design
software for buildings.2nd world congress of technology for improving the energy use, comfort, and economic of building
worldwide, International Building Performance Simulation As., Nice, Sophia-Antipolis (1991)

System requirements
-------------------

All you need to build this project is Java 1.7 or better, Maven 2.6 or better.

The application this project produces is designed to be run on command line

Configure Maven
---------------

If you have not yet done so, you must configure Maven before using this project. 

Run the application 
-------------------
(1)
./start.sh

OR

(2)

java -cp Interview.jar Main <file> <file> <date> <duration> <file>

e.g. java -cp Interview.jar Main items.txt alerts.json 2016-05-20 30 output.txt


Debug the Application
------------------------------------

If you want to debug the source code in the project, run either of the following commands to pull them into your local repository. The IDE should then detect them.

        mvn dependency:sources

