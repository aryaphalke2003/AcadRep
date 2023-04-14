package org.example;

import java.sql.*;

public class addstu extends admin {

    public boolean add(String utype,String uname,String umail,String udept,int uyear) throws SQLException {

        final String DB_URL = "jdbc:postgresql://localhost:5432/aims";
        final String USER = "postgres";
        final String PASS = "root";


        Connection adad = DriverManager.getConnection(DB_URL, USER, PASS);


        PreparedStatement cs = adad.prepareStatement("select * from auth where email=?");
        cs.setString(1,umail);
        ResultSet rr = cs.executeQuery();
        if(rr.next())
        {
            System.out.println("Already Added");
            return true;
        }

        PreparedStatement cStmt = adad.prepareStatement("INSERT INTO auth(email,password,username,role) VALUES (?, ?, ?, ?);");

        cStmt.setString(1, umail);
        cStmt.setString(2, "arya");
        cStmt.setString(3, uname);
        cStmt.setString(4, utype);
        cStmt.execute();
        cStmt.close();

        PreparedStatement ds = adad.prepareStatement("INSERT INTO  student(email, stuname,startyear, dept) VALUES (?,?, ?, ?);");

        ds.setString(1, umail);
        ds.setString(2, uname);
        ds.setInt(3,uyear);
        ds.setString(4, udept);
        ds.execute();
        ds.close();




        return true;

    }
}
