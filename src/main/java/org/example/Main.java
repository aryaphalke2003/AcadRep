package org.example;

import java.io.*;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("\nEnter Email: ");
            String email = br.readLine();
            System.out.println("Enter Password: ");
            String password = br.readLine();
            logincheck l = new logincheck();String[] a = l.check(email, password).split(",");
            if (a[0].equals("1")) {
                String role = a[1];String username = a[2];
                if (role.equals("admin")) {

                    admin admin = new admin();
                    admin.adminfunc(email);
                } else if (role.equals("faculty")) {

                    faculty faculty = new faculty();
                    faculty.facfunc(email, username, role);
                } else {

                    student student = new student();
                    student.stufunc(email, username, role);
                }
            } else if (a[0].equals("nopwd")) {
                System.out.println("\nWrong Password!");System.exit(0);
            } else {
                System.out.println("User Not Registered!");System.exit(0);
            }
        }
    }
}