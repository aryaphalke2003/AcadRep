package org.example;

import java.sql.*;

public class semyear extends uploadgrade {
    public int getsem() throws SQLException {

        final String DB_URL = "jdbc:postgresql://localhost:5432/aims";
        final String USER = "postgres";
        final String PASS = "root";
        Connection currse = DriverManager.getConnection(DB_URL, USER, PASS);
        PreparedStatement csem = currse.prepareStatement("select semester from sems where status=?");
        csem.setString(1, "running");
        int currsem = 0;
        ResultSet rss = csem.executeQuery();
        if (rss.next()) {
            currsem = rss.getInt(1);
        }
        csem.close();
        rss.close();
        currse.close();
//        if(currsem==0) {
//            return 2;
//        }
        return currsem;
    }

    public int getyear() throws SQLException {

        final String DB_URL = "jdbc:postgresql://localhost:5432/aims";
        final String USER = "postgres";
        final String PASS = "root";
        Connection currye = DriverManager.getConnection(DB_URL, USER, PASS);

        PreparedStatement csem = currye.prepareStatement("select year from sems where status=?");
        csem.setString(1, "running");
        int curryear = 0;
        ResultSet rss = csem.executeQuery();
        if (rss.next()) {
            curryear = rss.getInt(1);
        }
        csem.close();
        rss.close();
        currye.close();
//        if(curryear==0) {
//            return 2023;
//        }
        return curryear;

    }
}
