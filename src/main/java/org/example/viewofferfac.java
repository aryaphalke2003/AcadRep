package org.example;

import java.io.*;
import java.sql.*;

public class viewofferfac extends faculty {
    public boolean view(String facname) throws SQLException, IOException {

        final String DB_URL = "jdbc:postgresql://localhost:5432/aims";
        final String USER = "postgres";
        final String PASS = "root";

        Connection cfacv = DriverManager.getConnection(DB_URL, USER, PASS);
        PreparedStatement cs = cfacv.prepareStatement("select * from offeredc where facultyname=?");
        cs.setString(1, facname);

        ResultSet rs = cs.executeQuery();

        System.out.println("\n");

        System.out.println(" coursecode | dept | pos | facultyname | year | semester | cgcr ");

        while (rs.next()) {
            System.out.println(
                    rs.getString(1) + "      | " +
                            rs.getString(2) + "  | " +
                            rs.getString(3) + "  | " +
                            rs.getString(4) + "          | " +
                            rs.getString(5) + " |        " +
                            rs.getString(6) + " |    " +
                            rs.getString(7));
        }

        cs.close();
        rs.close();
        cfacv.close();
        return true;
    }
}
