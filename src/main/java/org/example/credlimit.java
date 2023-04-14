package org.example;

import java.sql.*;

public class credlimit extends student {
    public int get(String stumail, String stuname) throws SQLException {
        final String DB_URL = "jdbc:postgresql://localhost:5432/aims";
        final String USER = "postgres";
        final String PASS = "root";
        Connection credcon = DriverManager.getConnection(DB_URL, USER, PASS);
        semyear semyear = new semyear();
        int semc = semyear.getsem();
        int yearc = semyear.getyear();
        int clim = 18;
        PreparedStatement ps0 = credcon.prepareStatement("select credits from compc where stumail=? and year=? and grade!=? and grade!=? and semester=?");
        ps0.setString(1, stumail);
        ps0.setInt(2, yearc - 1);
        ps0.setString(3, "E");
        ps0.setString(4, "F");
        ps0.setInt(5, 2);
        PreparedStatement ps = credcon.prepareStatement("select credits from compc where stumail=? and stuname=? and year=? and grade!=? and grade!=? ");
        ps.setString(1, stumail);
        ps.setString(2, stuname);
        ps.setInt(3, yearc - 1);
        ps.setString(4, "E");
        ps.setString(5, "F");
        PreparedStatement pss = credcon.prepareStatement("select credits from compc where stumail=? and year=? and grade!=? and grade!=? and semester=?");
        pss.setString(1, stumail);
        pss.setInt(2, yearc);
        pss.setString(3, "E");
        pss.setString(4, "F");
        pss.setInt(5, 1);
        int cred1 = 0;
        int cred2 = 0;
        int cred3 = 0;
        if (semc == 1) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cred1 += rs.getInt(1);
            }
            if (cred1 != 0) {
                clim = (int) (cred1 * 0.625) + 1;
            }
            rs.close();
        } else {
            ResultSet rs = ps0.executeQuery();
            while (rs.next()) {
                cred2 += rs.getInt(1);
            }
            rs.close();
            ResultSet rss = pss.executeQuery();
            while (rss.next()) {
                cred3 += rss.getInt(1);
            }
            rss.close();
            if (cred2 != 0) {
                clim = (int) ((cred2 + cred3) * 0.625) + 1;
            }
        }
        ps.close();
        ps0.close();
        pss.close();
        return clim;
    }
}
