package org.example;

import java.sql.*;

public class viewgradestudent extends student {

    public boolean view(String stumail) throws SQLException {

        final String DB_URL = "jdbc:postgresql://localhost:5432/aims";
        final String USER = "postgres";
        final String PASS = "root";

        Connection viewgstu = DriverManager.getConnection(DB_URL, USER, PASS);

        System.out.println("\nGrades of all your completed courses\n");
        PreparedStatement ps = viewgstu
                .prepareStatement("select coursecode,credits,grade  from compc where stumail=? ");
        ps.setString(1, stumail);
        ResultSet rs = ps.executeQuery();
        System.out.println(" coursecode | credits | grade ");
        while (rs.next()) {
            System.out.println(
                    rs.getString(1) + " | " +
                            rs.getString(2) + " | " +
                            rs.getString(3));
        }
        rs.close();
        ps.close();
        viewgstu.close();
        return true;
    }
}
