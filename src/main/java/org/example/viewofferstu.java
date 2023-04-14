package org.example;

import java.io.IOException;
import java.sql.*;

public class viewofferstu extends student {
    public boolean view(String in) throws SQLException, IOException {

        final String DB_URL = "jdbc:postgresql://localhost:5432/aims";
        final String USER = "postgres";
        final String PASS = "root";

        Connection stuv = DriverManager.getConnection(DB_URL, USER, PASS);

        PreparedStatement cs = stuv.prepareStatement("select * from offeredc where year=? and semester=? and pos=?");
        semyear semyear = new semyear();
        int yy = semyear.getyear();
        int ss = semyear.getsem();
        System.out.println(yy);
        System.out.println(ss);

        cs.setInt(1, yy);
        cs.setInt(2, ss);
        cs.setString(3, in);
        ResultSet rs = cs.executeQuery();
        System.out.println("\n");
        System.out.println(" coursecode | dept | pos | facultyname | year | semester | cgcr ");
        while (rs.next()) {
            System.out.println(rs.getString(1) + "      | " + rs.getString(2) + "  | " + rs.getString(3) + "  | " + rs.getString(4) + "          | " + rs.getString(5) + " |        " + rs.getString(6) + " |    " + rs.getString(7));
        }
        cs.close();rs.close();stuv.close();return true;}}
