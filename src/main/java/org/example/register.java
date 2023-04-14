package org.example;

import java.io.*;
import java.sql.*;

public class register extends student {
    public boolean reg(String stumail, String stuname, String course,String coursetype) throws SQLException {
        final String DB_URL = "jdbc:postgresql://localhost:5432/aims";
        final String USER = "postgres";
        final String PASS = "root";
        Connection cregi = DriverManager.getConnection(DB_URL, USER, PASS);

        String studept = "";
        PreparedStatement dep = cregi.prepareStatement("select dept from student where email=?");
        dep.setString(1, stumail);
        ResultSet rdep = dep.executeQuery();
        if (rdep.next()) {
            studept = rdep.getString(1);
        }

        int netcredits = 0;
        semyear semyear = new semyear();
        int csem = semyear.getsem();
        int cyear = semyear.getyear();
        String dept = "";
        String posi = "";
        double cgcriteria = 0;

        credlimit credlimit = new credlimit();
        int credlim = credlimit.get(stumail, stuname);

        PreparedStatement cp = cregi.prepareStatement("select grade from compc where stumail=? and coursecode=?");
        cp.setString(1, stumail);
        cp.setString(2, course);
        ResultSet rcp = cp.executeQuery();
        if (rcp.next()) {
            String grade = rcp.getString(1);
            if (grade != "E" && grade != "F") {
                System.out.println("Passed already");
                return true;
            }
        }
        rcp.close();
        cp.close();


        PreparedStatement pc = cregi.prepareStatement("select * from coursecatalog where coursecode=?");
        pc.setString(1, course);
        ResultSet rs = pc.executeQuery();
        if (rs.next()) {

            dept = rs.getString(2);
            posi = rs.getString(3);
            int coursecred = rs.getInt(4);
            String[] prereq = rs.getString(8).split(",");

            PreparedStatement rc = cregi
                    .prepareStatement("select credits from runc where stumail=? and semester=? and year=?");
            rc.setString(1, stumail);
            rc.setInt(2, csem);
            rc.setInt(3, cyear);
            ResultSet rrc = rc.executeQuery();
            while (rrc.next()) {
                netcredits += rrc.getInt(1);
            }
            rc.close();
            rrc.close();

            PreparedStatement pcc = cregi.prepareStatement("select cgcr from offeredc where coursecode=? and year=? and semester=?");
            pcc.setString(1, course);
            pcc.setInt(2, cyear);
            pcc.setInt(3, csem);
            ResultSet rss = pcc.executeQuery();
            if (rss.next()) {
                cgcriteria = rss.getFloat(1);
            } else {
                System.out.println("Course not offered");
                return true;
            }
            rss.close();
            pcc.close();

            studentcg studentcg = new studentcg();
            double stucg = studentcg.getcg(stuname, stumail);

            if (netcredits <= credlim) {
                if ((double) stucg >= (double) cgcriteria) {
                    int count = 0;
                    if (prereq[0].equals("None")) {
                        PreparedStatement pcheck = cregi.prepareStatement("select * from runc where coursecode=? and stumail=? and year=? and semester=?");
                        pcheck.setString(1, course);

                        pcheck.setString(2, stumail);
                        pcheck.setInt(3, cyear);
                        pcheck.setInt(4, csem);
                        ResultSet chc = pcheck.executeQuery();
                        if (chc.next()) {
                            System.out.println("Already registered\n");
                            chc.close();
                            pcheck.close();
                            return true;
                        }
                        chc.close();
                        pcheck.close();
                        if (posi.equals("PC")) {
                            if (studept.equals(dept)) {



                                PreparedStatement ps = cregi.prepareStatement(
                                        "insert into runc( coursecode ,stumail ,stuname ,year,semester ,dept ,pos ,credits) values (?,?,?,?,?,?,?,?)");

                                ps.setString(1, course);
                                ps.setString(2, stumail);
                                ps.setString(3, stuname);
                                ps.setInt(4, cyear);
                                ps.setInt(5, csem);
                                ps.setString(6, dept);
                                ps.setString(7, posi);
                                ps.setInt(8, coursecred);
                                ps.execute();
                                ps.close();
                            } else {
                                System.out.println("\nNot a program core from your dept\n");
                            }

                        } else {
                            PreparedStatement ps = cregi.prepareStatement(
                                    "insert into runc( coursecode ,stumail ,stuname ,year,semester ,dept ,pos ,credits) values (?,?,?,?,?,?,?,?)");

                            ps.setString(1, course);
                            ps.setString(2, stumail);
                            ps.setString(3, stuname);
                            ps.setInt(4, cyear);
                            ps.setInt(5, csem);
                            ps.setString(6, dept);
                            ps.setString(7, posi);
                            ps.setInt(8, coursecred);
                            ps.execute();
                            ps.close();
                        }

                    } else {
                        for (int i = 0; i < prereq.length; i++) {

                            PreparedStatement pp = cregi.prepareStatement(
                                    "select stuname from compc where stumail=? and coursecode=?");
                            pp.setString(1, stumail);
                            pp.setString(2, prereq[i]);
                            ResultSet rv = pp.executeQuery();
                            if (rv.next()) {
                                count++;
                            }
                            pp.close();
                            rv.close();
                        }

                        if (count == prereq.length) {


                            PreparedStatement ppcheck = cregi.prepareStatement("select * from runc where coursecode=? and stumail=? and year=? and semester=?");
                            ppcheck.setString(1, course);

                            ppcheck.setString(2, stumail);
                            ppcheck.setInt(3, cyear);
                            ppcheck.setInt(4, csem);
                            ResultSet ckk = ppcheck.executeQuery();
                            if (ckk.next()) {
                                System.out.println("Already registered\n");
                                ckk.close();
                                ppcheck.close();
                                return true;
                            }
                            ckk.close();
                            ppcheck.close();

                            if (posi.equals("PC")) {


                                if (studept.equals(dept)) {


                                    PreparedStatement ps = cregi.prepareStatement(
                                            "insert into runc( coursecode ,stumail ,stuname ,year,semester ,dept ,pos ,credits) values (?,?,?,?,?,?,?,?)");

                                    ps.setString(1, course);
                                    ps.setString(2, stumail);
                                    ps.setString(3, stuname);
                                    ps.setInt(4, cyear);
                                    ps.setInt(5, csem);
                                    ps.setString(6, dept);
                                    ps.setString(7, posi);
                                    ps.setInt(8, coursecred);
                                    ps.execute();
                                    ps.close();

                                } else {
                                    System.out.println("\nNot a program core from your dept\n");
                                }
                            } else {

                                PreparedStatement ps = cregi.prepareStatement(
                                        "insert into runc( coursecode ,stumail ,stuname ,year,semester ,dept ,pos ,credits) values (?,?,?,?,?,?,?,?)");

                                ps.setString(1, course);
                                ps.setString(2, stumail);
                                ps.setString(3, stuname);
                                ps.setInt(4, cyear);
                                ps.setInt(5, csem);
                                ps.setString(6, dept);
                                ps.setString(7, posi);
                                ps.setInt(8, coursecred);
                                ps.execute();
                                ps.close();
                            }

                        } else {
                            System.out.println("\nSorry all prereq not completed\n");
                        }
                    }

                } else {
                    System.out.println("\nSorry cg criteria not completed\n");

                }
            } else {
                System.out.println("Please dereg from some as credit limit exceeded\n");
            }

        } else {
            System.out.println("Course not in catalog\n");
        }
        return true;
    }
}
