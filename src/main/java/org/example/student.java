package org.example;

import java.io.*;
import java.sql.*;

public class student extends logincheck {
    public boolean stufunc(String mail, String stuname, String role) throws SQLException {
        try {
            System.out.println("\nWelcome Student");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.println("\nPress the number:\n");
                System.out.println("1: For viewing offered courses");
                System.out.println("2: For registering in courses");
                System.out.println("3: For deregistering in courses");
                System.out.println("4: For viewing cg");
                System.out.println("5: For viewing your running courses");
                System.out.println("6: For viewing your completed courses");
                System.out.println("7: For viewing your grades");
                System.out.println("8: Change Password");
                System.out.println("9: Log Out\n");

                int i = Integer.parseInt(br.readLine());
                if (i == 1) {
                    System.out.println("Type the coursetype (PC|EC|ES)");
                    String inp = br.readLine();
                    viewofferstu viewofferstu = new viewofferstu();
                    viewofferstu.view(inp);
                } else if (i == 2) {
                    System.out.println("\nRegister Courses\n");
                    System.out.println("Type the coursetype (PC|EC|ES)");
                    String pos = br.readLine();
                    System.out.println("Type the course you want to register:");
                    String course = br.readLine();
                    register re = new register();
                    re.reg(mail,stuname,course,pos);
                } else if (i == 3) {
                    System.out.println("Type course to dereg:");
                    String code = br.readLine();
                    studereg studereg = new studereg();
                    studereg.dereg(mail,code);
                } else if (i == 4) {
                    studentcg studentcg = new studentcg();
                    System.out.println(studentcg.getcg(stuname, mail));
                } else if (i == 5) {
                    viewrunc viewrunc = new viewrunc();
                    viewrunc.view(stuname, mail);
                } else if (i == 6) {
                    viewcompc viewcompc = new viewcompc();
                    viewcompc.view(stuname, mail);
                } else if (i == 7) {
                    viewgradestudent v = new viewgradestudent();
                    v.view(mail);
                } else if(i==8)
                {
                    System.out.println("Enter new password: ");
                    String newpass = br.readLine();
                    changepass ch = new changepass();
                    ch.change(mail,newpass);
                } else if (i == 9) {
                    break;
                }else {System.out.println("Please enter correct number!\n");}
            }return true;} catch (IOException e) {e.printStackTrace();return false;}
    }
}
