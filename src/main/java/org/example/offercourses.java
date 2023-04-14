package org.example;

import java.io.*;
import java.sql.*;

public class offercourses extends deregoff {
    public boolean offer(String mail, String facname,String line) throws SQLException {

        final String DB_URL = "jdbc:postgresql://localhost:5432/aims";
        final String USER = "postgres";
        final String PASS = "root";
        Connection coffer = DriverManager.getConnection(DB_URL, USER, PASS);
        String[] arr = line.split("[ ]+");
        String dept = "";
        String pos = "";

        PreparedStatement ct = coffer
                .prepareStatement("select dept,pos from coursecatalog  where coursecode=?");
        ct.setString(1, arr[0]);
        ResultSet rs = ct.executeQuery();
        if (rs.next()) {
            dept = rs.getString(1);
            pos = rs.getString(2);
        }
        else{
            return true;
        }
        rs.close();
        ct.close();

        semyear semyear = new semyear();
        int curryear = semyear.getyear();
        int currsem = semyear.getsem();

        PreparedStatement cc = coffer.prepareStatement("select * from offeredc where facultyname=? and coursecode=? and semester=? and year=?");
        cc.setString(1,facname);
        cc.setString(2,arr[0]);
        cc.setInt(3,currsem);
        cc.setInt(4,curryear);
        ResultSet vv= cc.executeQuery();
        if(vv.next()){
            System.out.println("Already offered this sem");
            return true;
        }

        PreparedStatement cStmt = coffer.prepareStatement(
                "INSERT INTO offeredc (coursecode,dept,pos,facultyname,year,semester,cgcr) VALUES (?, ?, ?, ?,?, ?, ?);");
        cStmt.setString(1, arr[0]);
        cStmt.setString(2, dept);
        cStmt.setString(3, pos);
        cStmt.setString(4, facname);
        cStmt.setInt(5, curryear);
        cStmt.setInt(6, currsem);
        cStmt.setFloat(7, Float.parseFloat(arr[1]));
        cStmt.execute();
        cStmt.close();
        return true;
    }
}
