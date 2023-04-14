package org.example;
import java.io.*;
import java.sql.*;
public class uploadgrade extends faculty {
    public  boolean upload(String facname, String code) throws SQLException {

            final String DB_URL = "jdbc:postgresql://localhost:5432/aims";
            final String USER = "postgres";
            final String PASS = "root";

            System.out.println("\nProvide coursecode.csv file");

            Connection du = DriverManager.getConnection(DB_URL, USER, PASS);

            semyear semyear = new semyear();
            int csem = semyear.getsem();
            int cyear = semyear.getyear();

            PreparedStatement cd = du.prepareStatement("select dept,pos ,credits from coursecatalog where coursecode=?");
            cd.setString(1, code);
            ResultSet rr = cd.executeQuery();
            String dept = "";
            String pos = "";
            int cred = 0;
            if (rr.next()) {
                dept = rr.getString(1);
                pos = rr.getString(2);
                cred = rr.getInt(3);
            }
            cd.close();
            rr.close();

            String query = "create temporary table t(mail varchar, name varchar, grade varchar);copy t (mail , name , grade ) from '/home/arya/Desktop/csv/" + code + ".csv' DELIMITER ',' CSV HEADER;";

            PreparedStatement cc = du.prepareStatement(query);
            cc.execute();
            cc.close();
            PreparedStatement cStmt = du.prepareStatement("select * from t");
            ResultSet rs = cStmt.executeQuery();

            while (rs.next()) {
                PreparedStatement ps = du.prepareStatement("insert into  compc( coursecode,stumail,stuname,facultyname,year,semester,dept,pos,credits,grade)values (?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1, code);
                ps.setString(2, rs.getString(1));
                ps.setString(3, rs.getString(2));
                ps.setString(4, facname);
                ps.setInt(5, cyear);
                ps.setInt(6, csem);
                ps.setString(7, dept);
                ps.setString(8, pos);
                ps.setInt(9, cred);
                ps.setString(10, rs.getString(3));
                ps.execute();
                ps.close();

            }
            PreparedStatement ccc = du.prepareStatement("drop table t");
            ccc.execute();
            ccc.close();

            PreparedStatement cr = du.prepareStatement("delete from runc where coursecode=?");
            cr.setString(1, code);
            cr.execute();
            cr.close();

            du.close();
            return true;



    }
}
