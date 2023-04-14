package org.example;

import java.io.IOException;
import java.sql.*;

public class viewgradeadmin extends admin {

    public boolean view(String code, Integer ye, Integer se) throws SQLException {

        final String DB_URL = "jdbc:postgresql://localhost:5432/aims";
        final String USER = "postgres";
        final String PASS = "root";

        Connection viewad = DriverManager.getConnection(DB_URL, USER, PASS);

        PreparedStatement ppps = viewad
                .prepareStatement("select stuname,coursecode,credits,grade  from compc where  coursecode=? and year=? and semester=?");
        ppps.setString(1, code);
        ppps.setInt(2, ye);
        ppps.setInt(3, se);
        ResultSet rrrs = ppps.executeQuery();
        int c=0;
        System.out.println(" stuname | coursecode | credits | grade ");
        while (rrrs.next()) {
            c=1;
            System.out.println(
                    rrrs.getString(1) + " | " +
                            rrrs.getString(2) + " | " +
                            rrrs.getString(3) + " | " +
                            rrrs.getString(4));
        }
        rrrs.close();
        ppps.close();
        viewad.close();

        if(c==0)
        {
            System.out.println("Wrong data\n");
        }
        return true;
    }
}
