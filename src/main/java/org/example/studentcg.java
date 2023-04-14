package org.example;

import java.io.*;
import java.sql.*;
import java.text.DecimalFormat;

import static java.lang.Math.round;

public class studentcg extends student {
    public int func(String grade, int cred) {

        if (grade.equals("A")) {
            return (10 * cred);
        } else if (grade.equals("A-")) {
            return (9 * cred);

        } else if (grade.equals("B")) {
            return (8 * cred);

        } else if (grade.equals("B-")) {
            return (7 * cred);

        } else if (grade.equals("C")) {
            return (6 * cred);

        } else if (grade.equals("C-")) {
            return (5 * cred);

        } else if (grade.equals("D")) {
            return (4 * cred);

        } else {
            return 0;
        }
    }

    public double getcg(String stuname, String stumail) throws SQLException {
        final String DB_URL = "jdbc:postgresql://localhost:5432/aims";
        final String USER = "postgres";
        final String PASS = "root";
        Connection stucg = DriverManager.getConnection(DB_URL, USER, PASS);

        PreparedStatement ps = stucg.prepareStatement("select credits,grade from  compc where stumail=?");
        ps.setString(1, stumail);
        ResultSet rs = ps.executeQuery();

        int gradepoints = 0;
        int netcred = 0;
        while (rs.next()) {
            int cred = rs.getInt(1);
            String grade = rs.getString(2);
            grade = grade.replaceAll("\\s", "");
            if (!grade.equals("E") && !grade.equals("F")) {
                gradepoints += func(grade, cred);
                netcred += cred;
            }

        }
        double cg = 0.0;
        if (netcred != 0) {
            cg = (double) gradepoints / (double) netcred;
        }

        DecimalFormat df = new DecimalFormat("#.##");
        cg = Double.valueOf(df.format(cg));


        ps.close();
        rs.close();
        stucg.close();

        return cg;

    }
}
