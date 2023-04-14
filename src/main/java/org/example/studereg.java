package org.example;

import java.io.*;
import java.sql.*;

public class studereg extends register {
    public boolean dereg(String stumail, String code) throws SQLException {

        final String DB_URL = "jdbc:postgresql://localhost:5432/aims";
        final String USER = "postgres";
        final String PASS = "root";

        Connection studeregcon = DriverManager.getConnection(DB_URL, USER, PASS);

        PreparedStatement cr = studeregcon.prepareStatement("delete from runc where coursecode=? and stumail=? and year=? and semester=?");
        cr.setString(1, code);
        cr.setString(2, stumail);
        semyear semyear = new semyear();
        cr.setInt(3, semyear.getyear());
        cr.setInt(4, semyear.getsem());
        cr.execute();
        cr.close();
        return true;
    }
}
