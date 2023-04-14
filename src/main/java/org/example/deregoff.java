package org.example;

import java.io.*;
import java.sql.*;

public class deregoff extends faculty {
    public boolean dereg(String facname, String code) throws SQLException {

        final String DB_URL = "jdbc:postgresql://localhost:5432/aims";
        final String USER = "postgres";
        final String PASS = "root";
        semyear s = new semyear();
        int yr = s.getyear();
        int se = s.getsem();
        Connection der = DriverManager.getConnection(DB_URL, USER, PASS);

        PreparedStatement cStmt = der.prepareStatement("delete from offeredc where facultyname=? and coursecode=? and year=? and semester=? ");
        cStmt.setString(1, facname);
        cStmt.setString(2, code);
        cStmt.setInt(3, yr);
        cStmt.setInt(4, se);
        cStmt.execute();
        cStmt.close();
        return true;
    }
}