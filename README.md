*Good framework should incluse:-
  1.Reusable methods
2.Logging
\3.LOW maintenance
4.Reporting 
5.Test cases mapping with manual test cases
6.data changes without compiling   IMP


.........................................................


Three steps of framework -: Implemantaon, Execution, Maintenance


            *Steps to buid framework
1.choose programming languages
2.Choose unit testing  framework -> to manage test cases
3.Design architechture 
    -POM with page factory 
    -Maven 
    -utilities  (read excelfile, listener, configuration file)
4.Choose reporting mechainsh  (extent report)
5.Logging (Log4J2)

Execution:
6.Choose version control mechanism
7.Decide how to implment CI/CD




Implementaion:-

Packages-: 1.page objects
		LpginPAGE.JAVA
           2.Utilities
                Listener.java
		ReadConfig.jav
		ReadExcel.java
           3.Configuration file
		Config.properties
 	   4.Testcases
		Baseclass.java (Super class)
		Tc1.java    (child clas)
src/main/resources :- Log4j.properties

Folders:-
           Drivers
  	   Logs
          Screnshots

Execution:-
           Testng.xml
           Pom.xml (use to run tc in eclips as well outside of eclipse Ex.jenkins)

Maintenance:-  Git/Github,  Jenkins


...........................................................
Website :=  http://www.automationpractice.pl/index.php
 			gauravdandekar@gmail.com
			Gaurav@123

   Note:excel implementaion error, framework remaining 
