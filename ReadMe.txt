Name: Arya Abhijit Phalke
Roll: 2020CSB1107

For running main file just do:

javac Main.java
java Main

The only runnable file is Main following which all files are subsequently run using userinput.

The structure of code is as:


1. Main:

                   -> student
Main -> logincheck -> admin
                   -> faculty

Its the login page which takes useremail and password as input. 
Passes this to logincheck function which authorizes the user by checking against auth table in database.
Once authorized it sends user to respective interface.



2. Logincheck:

It compares username and password with those present in database.
Also its tells "User not registered" and "Wrong password".



3. Admin:

It has various options displayed and based on user input it sends user to various functions.
Set Semester
View all courses
View grade
Add courses
Generate transcript
Graduation check



4. Faculty:

Similar to admin various functions are called as per there user input.
Offer course to students
Deoffer course
Upload grades of students
View student grades
View course catalog


5. Student:

It has various options displayed and it takes user input for the same.
Then as per userinput it calls those functions.
View offered courses this sem
View running courses this sem
View completed courses this sem
View cg
View grades
Register in courses
Deregister from courses



6. Database 

Following are my tables:

public | auth          | table | postgres
public | compc         | table | postgres
public | coursecatalog | table | postgres
public | faculty       | table | postgres
public | offeredc      | table | postgres
public | runc          | table | postgres
public | sems          | table | postgres
public | student       | table | postgres


final String DB_URL = "jdbc:postgresql://localhost:5432/aims";
final String USER = "postgres";
final String PASS = "root";



7. Gradle Jacoco Report Build

./gradlew tasks
./gradlew clean build
./gradlew jacocoTestReport

Junit Tests have been made for each class:
coureaddTest
credlimitTest
deregoffTest
genscriptTest
gradcheckTest
logincheckTest
offercoursesTest
registerTest
semsetTest
studentcgTest
studeregTest
uploadgradeTest
viewcompcTest
viewcourseTest
viewgradeadminTest
viewgradefacultyTest
viewgradestudentTest
viewofferfacTest
viewofferstuTest
viewruncTest

Classes made are:
Main
admin
faculty
student
logincheck
coureadd
credlimit
deregoff
genscript
gradcheck
logincheck
offercourses
register
semset
studentcg
studereg
uploadgrade
viewcompc
viewcourse
viewgradeadmin
viewgradefaculty
viewgradestudent
viewofferfac
viewofferstu
viewrunc