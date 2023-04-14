package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class adminTest {


    @Test
    void adminfunc1E() throws SQLException {
        admin admin=new admin();
        ByteArrayInputStream in = new ByteArrayInputStream("1\nE\n9\n".getBytes());
        System.setIn(in);
        assertTrue(admin.adminfunc("arya@gmail.com"));
    }
    @Test
    void adminfunc1S() throws SQLException {
        admin admin=new admin();
        ByteArrayInputStream in = new ByteArrayInputStream("1\nS\n2023\n1\n9\n".getBytes());
        System.setIn(in);
        assertTrue(admin.adminfunc("arya@gmail.com"));
    }

    @Test
    void adminfunc1V() throws SQLException {
        admin admin=new admin();
        ByteArrayInputStream in = new ByteArrayInputStream("1\nV\n9\n".getBytes());
        System.setIn(in);
        assertTrue(admin.adminfunc("arya@gmail.com"));
    }
    @Test
    void adminfunc2() throws SQLException {
        admin admin=new admin();
        ByteArrayInputStream in = new ByteArrayInputStream("2\nCS556 CSE PC 4 4-3-2 CS202\n9\n".getBytes());
        System.setIn(in);
        assertTrue(admin.adminfunc("arya@gmail.com"));
    }
    @Test
    void adminfunc3() throws SQLException {
        admin admin=new admin();
        ByteArrayInputStream in = new ByteArrayInputStream("3\n9\n".getBytes());
        System.setIn(in);
        assertTrue(admin.adminfunc("arya@gmail.com"));
    }

    @Test
    void adminfunc4() throws SQLException {
        admin admin=new admin();
        ByteArrayInputStream in = new ByteArrayInputStream("4\nHS201\n2022\n1\n9\n".getBytes());
        System.setIn(in);
        assertTrue(admin.adminfunc("arya@gmail.com"));
    }

    @Test
    void adminfunc5() throws SQLException {
        admin admin=new admin();
        ByteArrayInputStream in = new ByteArrayInputStream("5\nStudent1\n1@iitrpr.ac.in\n9\n".getBytes());
        System.setIn(in);
        assertTrue(admin.adminfunc("arya@gmail.com"));
    }

    @Test
    void adminfunc6() throws SQLException {
        admin admin=new admin();
        ByteArrayInputStream in = new ByteArrayInputStream("6\nStudent1\n1@iitrpr.ac.in\n9\n".getBytes());
        System.setIn(in);
        assertTrue(admin.adminfunc("arya@gmail.com"));
    }



    @Test
    void adminfunc7n() throws SQLException {
        admin admin=new admin();
        ByteArrayInputStream in = new ByteArrayInputStream("7\nasdasd\nnone\nnone\ndept\n9\n".getBytes());
        System.setIn(in);
        assertTrue(admin.adminfunc("arya@gmail.com"));
    }
    @Test
    void adminfunc7a() throws SQLException {
        admin admin=new admin();
        ByteArrayInputStream in = new ByteArrayInputStream("7\nadmin\narya2\narya2@gmail.com\ndept\n9\n".getBytes());
        System.setIn(in);
        assertTrue(admin.adminfunc("arya@gmail.com"));
    }
    @Test
    void adminfunc7s() throws SQLException {
        admin admin=new admin();
        ByteArrayInputStream in = new ByteArrayInputStream("7\nstudent\nStudent11\nstudent11@iitrpr.ac.in\nCSE\n2021\n9\n".getBytes());
        System.setIn(in);
        assertTrue(admin.adminfunc("arya@gmail.com"));
    }
    @Test
    void adminfunc7f() throws SQLException {
        admin admin=new admin();
        ByteArrayInputStream in = new ByteArrayInputStream("7\nfaculty\nAP1\nap1@iitrpr.ac.in\nCSE\n9\n".getBytes());
        System.setIn(in);
        assertTrue(admin.adminfunc("arya@gmail.com"));
    }
    @Test
    void adminfunc8() throws SQLException {
        admin admin=new admin();
        ByteArrayInputStream in = new ByteArrayInputStream("8\narya\n9\n".getBytes());
        System.setIn(in);
        assertTrue(admin.adminfunc("arya@gmail.com"));
    }
    @Test
    void adminfunc9() throws SQLException {
        admin admin=new admin();
        ByteArrayInputStream in = new ByteArrayInputStream("9\n".getBytes());
        System.setIn(in);
        assertTrue(admin.adminfunc("arya@gmail.com"));
    }
    @Test
    void adminfunc10() throws SQLException {
        admin admin=new admin();
        ByteArrayInputStream in = new ByteArrayInputStream("10\n9\n".getBytes());
        System.setIn(in);
        assertTrue(admin.adminfunc("arya@gmail.com"));
    }

}