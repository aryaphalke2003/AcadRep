package org.example;

import java.io.*;
import java.sql.*;
import java.util.Scanner;



public class faculty extends logincheck {

    public boolean facfunc(String mail, String facname, String role) throws SQLException {
        System.out.println("\nWelcome Faculty");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                System.out.println("\nPress the number:\n");
                System.out.println("1: For offering courses this semester");
                System.out.println("2: For uploading grades of students");
                System.out.println("3: For viewing grades of students");
                System.out.println("4: For deregistering offered courses");
                System.out.println("5: For viewing offered courses");
                System.out.println("6: For viewing the coursecatalog");
                System.out.println("7: Change Password");
                System.out.println("8: Log Out\n");
                int i = Integer.parseInt(br.readLine());
                if (i == 1) {
                    System.out.println("\nOffer Courses\n");
                    System.out.println("Type courses in format: \"Coursecode Cg-Criteria\"");
                    System.out.println("Example format: \"CS305 6.5\"\n");
                    String line = br.readLine();
                    offercourses offercourses = new offercourses();
                    offercourses.offer(mail, facname, line);
                } else if (i == 2) {
                    System.out.println("Type coursecode to grade:");
                    String code = br.readLine();
                    uploadgrade uploadgrade = new uploadgrade();
                    uploadgrade.upload(facname, code);
                } else if (i == 3) {
                    System.out.println("Type coursecode:");
                    String cd = br.readLine();
                    System.out.println("Type year: ");
                    int ye = Integer.parseInt(br.readLine());
                    System.out.println("Type sem:");
                    int se = Integer.parseInt(br.readLine());
                    viewgradefaculty v = new viewgradefaculty();
                    v.view(cd, facname, ye, se);
                } else if (i == 4) {
                    System.out.println("Type courses you want to deregister for");
                    String code = br.readLine();
                    deregoff deregoff = new deregoff();
                    deregoff.dereg(facname, code);
                } else if (i == 5) {
                    viewofferfac viewofferfac = new viewofferfac();
                    viewofferfac.view(facname);
                } else if (i == 6) {
                    viewcourse viewcourse = new viewcourse();
                    viewcourse.view();
                }
                else if(i==7)
                {
                    System.out.println("Enter new password: ");
                    String newpass = br.readLine();
                    changepass ch = new changepass();
                    ch.change(mail,newpass);
                }
                else if (i == 8) {break;}
                else {System.out.println("Please enter correct number!\n");}}
            return true;} catch (IOException e) {e.printStackTrace();return false;}}}
