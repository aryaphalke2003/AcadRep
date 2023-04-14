package org.example;

import java.sql.*;

public class logincheck {
    public String check(String email, String password) throws SQLException {

        final String DB_URL = "jdbc:postgresql://localhost:5432/aims";
        final String USER = "postgres";
        final String PASS = "root";

        Connection c = DriverManager.getConnection(DB_URL, USER, PASS);
        PreparedStatement cStmt = c.prepareStatement("select password,role,username FROM auth WHERE auth.email = ?");
        cStmt.setString(1, email);
        String pwd = "";
        String role = "";
        String username = "";
        ResultSet rs = cStmt.executeQuery();
        if (rs.next()) {

            pwd = rs.getString(1);
            role = rs.getString(2);
            username = rs.getString(3);

            if (pwd.equals(password)) {
                String r = "1,"+role+","+username;
                return r;
            } else {
                return "nopwd";
            }
        }
        else{
            return "nouser";
        }
    }
}
