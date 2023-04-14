package org.example;

import java.io.*;
import java.sql.*;

public class admin extends logincheck {

    public boolean adminfunc(String mail) throws SQLException {
        try {
            System.out.println("\nWelcome Admin");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.println("\nPress the number:\n");
                System.out.println("1: For setting semester");
                System.out.println("2: For adding courses to course catalog");
                System.out.println("3: For viewing courses in course catalog");
                System.out.println("4: For viewing student grades");
                System.out.println("5: For generating student transcript");
                System.out.println("6: To check for graduation");
                System.out.println("7: Add Users");
                System.out.println("8: Change Password");
                System.out.println("9: Log Out\n");

                int i = Integer.parseInt(br.readLine());
                if (i == 1) {
                    System.out.println("\nSet Semester\n");
                    System.out.println("Type S to start a sem | E to end a sem | V to view sems");
                    String choice = br.readLine();
                    int year = -1;
                    int sem = -1;
                    if (choice.equals("S")) {
                        System.out.println("Type year: ");
                        year = Integer.parseInt(br.readLine());
                        System.out.println("Type sem: ");
                        sem = Integer.parseInt((br.readLine()));
                    }
                    semset semset = new semset();
                    semset.set(choice, year, sem);
                } else if (i == 2) {
                    System.out.println("\nAdd Courses\n");
                    System.out.println("Type courses in format: \"Coursecode Dept Type Credit Lec-Tut-Prac Prerequisites\"");
                    System.out.println("Example format: \"CS305 CSE PC/EC/ES 4 4-3-2 CS201,CS202\"\n");
                    System.out.println("Type \"None\" if no prerequisite");
                    String line = br.readLine();
                    courseadd courseadd = new courseadd();
                    courseadd.add(line);
                } else if (i == 3) {
                    viewcourse viewcourse = new viewcourse();
                    viewcourse.view();
                } else if (i == 4) {
                    System.out.println("Type course: ");
                    String code = br.readLine();
                    System.out.println("Type year: ");
                    int ye = Integer.parseInt(br.readLine());
                    System.out.println("Type sem: ");
                    int se = Integer.parseInt((br.readLine()));
                    viewgradeadmin v = new viewgradeadmin();
                    v.view(code, ye, se);
                } else if (i == 5) {
                    System.out.println("Type student name: ");
                    String nname = br.readLine();
                    System.out.println("Type student mail: ");
                    String mmail = br.readLine();
                    genscript genscript = new genscript();
                    genscript.gen(mmail, nname);
                } else if (i == 6) {
                    System.out.println("Type student name: ");
                    String nname = br.readLine();
                    System.out.println("Type student mail: ");
                    String mmail = br.readLine();
                    gradcheck gradcheck = new gradcheck();
                    gradcheck.chek(nname, mmail);
                }
                else if (i == 7) {
                    System.out.println("Type user-type (admin/faculty/student): ");
                    String utype = br.readLine();
                    System.out.println("Type username: ");
                    String uname = br.readLine();
                    System.out.println("Type usermail: ");
                    String umail = br.readLine();
                    System.out.println("Type userdept: ");
                    String udept = br.readLine();
                    if(utype.equals("admin"))
                    {
                        addadmin addadmin = new addadmin();
                        addadmin.add(utype,uname,umail,udept);
                    }
                    else if(utype.equals("student"))
                    {
                        System.out.println("Type start year: ");
                        int uyear = Integer.parseInt(br.readLine());
                        addstu addstu = new addstu();
                        addstu.add(utype,uname,umail,udept,uyear);
                    }
                    else if(utype.equals("faculty"))
                    {
                        addfac addfac = new addfac();
                        addfac.add(utype,uname,umail,udept);
                    }
                    else
                    {
                        System.out.println("Wrong UserType");
                    }
                }
                else if(i==8)
                {
                    System.out.println("Enter new password: ");
                    String newpass = br.readLine();
                    changepass ch = new changepass();
                    ch.change(mail,newpass);
                }
                else if (i == 9) {
                    break;
                }
                else {
                    System.out.println("Please enter correct number!\n");
                }
            }
            return true;} catch (IOException e) {e.printStackTrace();return false;}}}
