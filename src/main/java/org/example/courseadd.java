package org.example;

import java.sql.*;

public class courseadd extends admin {

    public boolean add(String line) throws SQLException {

        final String DB_URL = "jdbc:postgresql://localhost:5432/aims";
        final String USER = "postgres";
        final String PASS = "root";


        Connection coursed = DriverManager.getConnection(DB_URL, USER, PASS);

        String[] arr = line.split("[ ]+|-");

        PreparedStatement cs = coursed.prepareStatement("select * from coursecatalog where coursecode=? and dept=?");
        cs.setString(1,arr[0]);
        cs.setString(2,arr[1]);
        ResultSet rr = cs.executeQuery();
        if(rr.next())
        {
            System.out.println("Already Added");
            return true;
        }

        PreparedStatement cStmt = coursed.prepareStatement("INSERT INTO coursecatalog(coursecode, dept,pos,credits, lec, tut, prac, prereq) VALUES (?, ?, ?, ?, ?, ?, ?, ?);");

        cStmt.setString(1, arr[0]);
        cStmt.setString(2, arr[1]);
        cStmt.setString(3, arr[2]);
        cStmt.setInt(4, Integer.parseInt(arr[3]));
        cStmt.setInt(5, Integer.parseInt(arr[4]));
        cStmt.setInt(6, Integer.parseInt(arr[5]));
        cStmt.setInt(7, Integer.parseInt(arr[6]));
        cStmt.setString(8, arr[7]);
        cStmt.execute();
        cStmt.close();
        return true;

    }
}
