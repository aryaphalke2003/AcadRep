package org.example;

import java.sql.*;

public class viewgradefaculty extends faculty {

    public boolean view (String code,String facname,Integer ye,Integer se) throws SQLException {

        final String DB_URL = "jdbc:postgresql://localhost:5432/aims";
        final String USER = "postgres";
        final String PASS = "root";
        Connection viewfac = DriverManager.getConnection(DB_URL, USER, PASS);

        PreparedStatement ch = viewfac.prepareStatement("select * from  offeredc where coursecode=? and facultyname=? and year=? and semester=?");
        ch.setString(1,code);
        ch.setString(2,facname);
        ch.setInt(3,ye);
        ch.setInt(4,se);
        ResultSet rc = ch.executeQuery();
        if(rc.next())
        {

            PreparedStatement pps = viewfac.prepareStatement("select stuname,coursecode,credits,grade from compc where year=? and semester=? and coursecode=?");
            pps.setInt(1, ye);
            pps.setInt(2, se);
            pps.setString(3, code);
            ResultSet rrs = pps.executeQuery();
            System.out.println(" stuname | coursecode | credits | grade ");
            while (rrs.next()) {
                System.out.println(
                        rrs.getString(1) + " | " +
                                rrs.getString(2) + " | " +
                                rrs.getString(3) + " | " +
                                rrs.getString(4));
            }
            rrs.close();
            pps.close();

        } else {
            rc.close();
            ch.close();
            System.out.println("Course not offered by you");
        }
        viewfac.close();
        return true;
    }
}
