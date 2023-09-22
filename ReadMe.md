# AcadRep

**Name:** Arya Abhijit Phalke  
**Roll:** 2020CSB1107

## Running the Program

To run the main file, follow these steps:

1. Compile `Main.java`:
    ```
    javac Main.java
    ```

2. Execute the program:
    ```
    java Main
    ```

## Code Structure

The code is organized into the following components:

1. **Main**:
   - `Main` -> `logincheck` -> `admin` or `faculty` or `student`
   - Acts as the login page, taking user email and password as input, authorizing users, and directing them to their respective interfaces.

2. **Logincheck**:
   - Compares the username and password with those in the database.
   - Provides error messages for "User not registered" or "Wrong password."

3. **Admin**:
   - Offers various options to users based on input, such as setting the semester, viewing courses, adding courses, and more.

4. **Faculty**:
   - Similar to admin, offers various functions including offering courses to students, uploading grades, and managing the course catalog.

5. **Student**:
   - Provides options for viewing offered courses, completed courses, GPA, grades, and registering/deregistering from courses.

6. **Database**:
   - Lists the tables in the database used in the project and includes the database connection details.

7. **Gradle Jacoco Report Build**:
   - Outlines the Gradle tasks for building the project and generating Jacoco test reports.
   - Lists JUnit tests for each class.

## Tables in the Database

- `auth`
- `compc`
- `coursecatalog`
- `faculty`
- `offeredc`
- `runc`
- `sems`
- `student`

Database Connection Details:
```java
final String DB_URL = "jdbc:postgresql://localhost:5432/aims";
final String USER = "postgres";
final String PASS = "root";
