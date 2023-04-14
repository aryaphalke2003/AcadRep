package org.example;

import java.io.*;
import java.sql.*;

public class changepass {
    public boolean change(String mail,String newpass) throws SQLException {

        final String DB_URL = "jdbc:postgresql://localhost:5432/aims";
        final String USER = "postgres";
        final String PASS = "root";
        Connection cpass = DriverManager.getConnection(DB_URL, USER, PASS);
        PreparedStatement ct = cpass.prepareStatement("update auth set password=? where email=?");
        ct.setString(1, newpass);
        ct.setString(2,mail);
        ct.execute();
        ct.close();
        return true;
    }
}
