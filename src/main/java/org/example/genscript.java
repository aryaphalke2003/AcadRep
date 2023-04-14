package org.example;

import java.io.*;
import java.sql.*;
public class genscript extends admin {

    public boolean gen(String stumail,String stuname) throws SQLException, IOException {

            final String DB_URL = "jdbc:postgresql://localhost:5432/aims";
            final String USER = "postgres";
            final String PASS = "root";

            Connection cgents = DriverManager.getConnection(DB_URL, USER, PASS);
            int syear=0;
            semyear semye = new semyear();
            int cyear=semye.getyear();
            int csem=semye.getsem();

            PreparedStatement pp = cgents.prepareStatement("select startyear from student where email=?");
            pp.setString(1,stumail);
            ResultSet rv = pp.executeQuery();
            if(rv.next()){
                syear=rv.getInt(1);
            }
            int yy=syear;
            int tsems=0;
            if (csem==2)
            {
                tsems = (cyear-syear)*2 + 1;
            }
            else
            {
                tsems = (cyear-syear)*2;
            }
            if(tsems>8) {tsems=8;}

            if(tsems==0){return true;}

            FileWriter mc = new FileWriter("/home/arya/Desktop/" + stuname + ".txt");
            mc.write("Transcript of " + stuname + "\n\n");
            studentcg studentcg = new studentcg();
            mc.write("Your cg is " + studentcg.getcg(stuname, stumail)+"\n\n");

            PreparedStatement tc = cgents.prepareStatement("select credits from compc where stumail=? and grade!=? and grade!=?");
            tc.setString(1,stumail);
            tc.setString(2,"E");
            tc.setString(3,"F");
        ResultSet rss = tc.executeQuery();
        int netcred=0;
        while(rss.next())
        {
            netcred += rss.getInt(1);
        }
        tc.close();
        rss.close();

        mc.write("You have earned " + netcred +" credits\n\n");
        System.out.println(tsems);
            for(int i=1;i<=tsems;i++)
            {PreparedStatement ps = cgents.prepareStatement("select coursecode,grade from compc where stumail=? and year=? and semester=?");
                ps.setString(1, stumail);
                ps.setInt(2,yy);
                    if(i%2==1) {ps.setInt(3, 1);}
                    else{ps.setInt(3,2);}
                    ResultSet rs = ps.executeQuery();
                    mc.write("\nSemester " + String.valueOf(i) + "\n");
                    while (rs.next()) {
                        String op = rs.getString(1) + " | " + rs.getString(2) + "\n";
                        mc.write(op);}
                ps.close();
                    rs.close();
                    if(i%2==0){yy++;}
            }

            mc.close();
            return true;
    }
}
