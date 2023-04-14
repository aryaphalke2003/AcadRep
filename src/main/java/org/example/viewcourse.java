package org.example;
import java.io.*;
import java.sql.*;
public class viewcourse extends student {
    public boolean view() throws SQLException {

        final String DB_URL = "jdbc:postgresql://localhost:5432/aims";
        final String USER = "postgres";
        final String PASS = "root";

        Connection cv = DriverManager.getConnection(DB_URL, USER, PASS);
        PreparedStatement cStmt = cv.prepareStatement("select * from coursecatalog");
        ResultSet rs = cStmt.executeQuery();


        System.out.println(" coursecode | dept | pos | credits | lec | tut | prac | prereq ");

        while (rs.next()) {
            System.out.println(rs.getString(1) + "  | " +
                    rs.getString(2) + " | " +
                    rs.getString(3) + " | " +
                    rs.getString(4) + " | " +
                    rs.getString(5) + " | " +
                    rs.getString(6) + " | " +
                    rs.getString(7) + " | " +
                    rs.getString(8));
        }

        cStmt.close();
        rs.close();
        cv.close();
        return true;

    }
}
