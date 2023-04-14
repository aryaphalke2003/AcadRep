package org.example;
import java.io.*;
import java.sql.*;
public class viewcompc extends gradcheck {
    public boolean view(String stuname, String stumail) throws SQLException, IOException {

        final String DB_URL = "jdbc:postgresql://localhost:5432/aims";
        final String USER = "postgres";
        final String PASS = "root";

        Connection compcv = DriverManager.getConnection(DB_URL, USER, PASS);

        PreparedStatement cs = compcv.prepareStatement("select * from compc where stumail=?");
        cs.setString(1, stumail);
        ResultSet rs = cs.executeQuery();

        System.out.println("\nCompleted Courses\n");

        System.out.println("  coursecode | stumail | stuname | facultyname | year | semester | dept | pos | credits | grade  ");

        while (rs.next()) {
            System.out.println(
                    rs.getString(1) + " | " +
                            rs.getString(2) + " | " +
                            rs.getString(3) + " | " +
                            rs.getString(4) + " | " +
                            rs.getString(5) + " | " +
                            rs.getString(6) + " | " +
                            rs.getString(7) + " | " +
                            rs.getString(8) + " | " +
                            rs.getString(9) + " | " +
                            rs.getString(10));
        }

        cs.close();
        rs.close();
        compcv.close();
        return true;


    }
}
