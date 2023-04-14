package org.example;

import java.io.*;
import java.sql.*;

public class gradcheck extends admin {
    public boolean chek(String stuname,String stumail) throws SQLException {

        final String DB_URL = "jdbc:postgresql://localhost:5432/aims";
        final String USER = "postgres";
        final String PASS = "root";

        Connection gcheck = DriverManager.getConnection(DB_URL, USER, PASS);

        System.out.println("\nGraduation Check\n");

        PreparedStatement ps = gcheck.prepareStatement("select * from compc where stumail=?");
        ps.setString(1, stumail);

        int pccred = 0;
        int eccred = 0;
        int escred = 0;

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            String pos = rs.getString(8);
            int cred = rs.getInt(9);
            String grade = rs.getString(10);
            if (!grade.equals("E") && !grade.equals("F")) {
                if (pos.equals("PC")) {
                    pccred += cred;
                } else if (pos.equals("EC")) {
                    eccred += cred;
                } else {
                    escred += cred;
                }
            }

        }

        rs.close();
        ps.close();

        if (pccred >= 60 && eccred >= 30 && escred >= 30) {
            System.out.println("Student " + stuname + " has successfully graduated\n");
        } else {

            System.out.println("PC Core " + (60 - pccred) + " credits left to graduate");
            System.out.println("EC Core " + (30 - eccred) + " credits left to graduate");
            System.out.println("ES Core " + (30 - escred) + " credits left to graduate");

        }
        gcheck.close();
        return true;
    }

}
