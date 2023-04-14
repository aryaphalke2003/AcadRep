package org.example;

import java.io.*;
import java.sql.*;

public class semset extends admin {
    public boolean set(String inp, Integer year, Integer semester) throws SQLException {

        final String DB_URL = "jdbc:postgresql://localhost:5432/aims";
        final String USER = "postgres";
        final String PASS = "root";
        Connection cset = DriverManager.getConnection(DB_URL, USER, PASS);
        if (inp.equals("S")) {
            PreparedStatement cs = cset.prepareStatement("insert into sems(year,semester,status) values (?,?,?)");
            cs.setInt(1, year);
            cs.setInt(2, semester);
            cs.setString(3, "running");
            cs.execute();cs.close();cset.close();
        } else if (inp.equals("E")) {
            System.out.println("Ending current sem");
            PreparedStatement cs = cset.prepareStatement("update sems set status=? where status=?");
            cs.setString(1, "completed");
            cs.setString(2, "running");
            cs.execute();
            cs.close();
            cset.close();
        } else if (inp.equals("V")) {

            PreparedStatement cStmt = cset.prepareStatement("select * from sems");
            ResultSet rs = cStmt.executeQuery();
            System.out.println(" year | semester | status ");
            while (rs.next()) {
                System.out.println(rs.getString(1) + "  | " +
                        rs.getString(2) + " | " +
                        rs.getString(3));
            }
            cStmt.close();
            rs.close();
            cset.close();
        } else {
            System.out.println("Please type S E or V");
        }
        return true;
    }
}


