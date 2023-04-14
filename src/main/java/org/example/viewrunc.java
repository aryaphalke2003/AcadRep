package org.example;
import java.io.*;
import java.sql.*;
public class viewrunc extends student {
    public boolean view(String stuname, String stumail) throws SQLException, IOException {

        final String DB_URL = "jdbc:postgresql://localhost:5432/aims";
        final String USER = "postgres";
        final String PASS = "root";

        Connection runcv = DriverManager.getConnection(DB_URL, USER, PASS);

        PreparedStatement cs = runcv.prepareStatement("select * from runc where stumail=?");
        cs.setString(1, stumail);
        ResultSet rs = cs.executeQuery();

        System.out.println("\nRunning Courses\n");

        System.out.println("  coursecode | stumail | stuname | year | semester | dept | pos | credits  ");

        while (rs.next()) {
            System.out.println(
                    rs.getString(1) + " | " +
                            rs.getString(2) + " | " +
                            rs.getString(3) + " | " +
                            rs.getString(4) + " | " +
                            rs.getString(5) + " | " +
                            rs.getString(6) + " | " +
                            rs.getString(7) + " | " +
                            rs.getString(8));
        }

        cs.close();
        rs.close();
        runcv.close();
        return true;


    }

}
