package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class facultyTest {


    @Test
    void facfunc1() throws SQLException {
        faculty faculty=new faculty();
        ByteArrayInputStream in = new ByteArrayInputStream("1\nCS505 7.0\n8\n".getBytes());
        System.setIn(in);
        assertTrue(faculty.facfunc("faculty@iitrpr.ac.in","Arya Faculty","faculty"));
    }

    @Test
    void facfunc2() throws SQLException {
        faculty faculty=new faculty();
        ByteArrayInputStream in = new ByteArrayInputStream("2\nCS301\n8\n".getBytes());
        System.setIn(in);
        assertTrue(faculty.facfunc("faculty@iitrpr.ac.in","Arya Faculty","faculty"));
    }
    @Test
    void facfunc3() throws SQLException {
        faculty faculty=new faculty();
        ByteArrayInputStream in = new ByteArrayInputStream("3\nCS202\n2022\n1\n8\n".getBytes());
        System.setIn(in);
        assertTrue(faculty.facfunc("faculty@iitrpr.ac.in","Arya Faculty","faculty"));
    }

    @Test
    void facfunc4() throws SQLException {
        faculty faculty=new faculty();
        ByteArrayInputStream in = new ByteArrayInputStream("4\nCS505\n8\n".getBytes());
        System.setIn(in);
        assertTrue(faculty.facfunc("faculty@iitrpr.ac.in","Arya Faculty","faculty"));
    }

    @Test
    void facfunc5() throws SQLException {
        faculty faculty=new faculty();
        ByteArrayInputStream in = new ByteArrayInputStream("5\n8\n".getBytes());
        System.setIn(in);
        assertTrue(faculty.facfunc("faculty@iitrpr.ac.in","Arya Faculty","faculty"));
    }

    @Test
    void facfunc6() throws SQLException {
        faculty faculty=new faculty();
        ByteArrayInputStream in = new ByteArrayInputStream("6\n8\n".getBytes());
        System.setIn(in);
        assertTrue(faculty.facfunc("faculty@iitrpr.ac.in","Arya Faculty","faculty"));
    }

    @Test
    void facfunc7() throws SQLException {
        faculty faculty=new faculty();
        ByteArrayInputStream in = new ByteArrayInputStream("7\narya\n8\n".getBytes());
        System.setIn(in);
        assertTrue(faculty.facfunc("faculty@iitrpr.ac.in","Arya Faculty","faculty"));
    }

    @Test
    void facfunc8() throws SQLException {
        faculty faculty=new faculty();
        ByteArrayInputStream in = new ByteArrayInputStream("8\n".getBytes());
        System.setIn(in);
        assertTrue(faculty.facfunc("faculty@iitrpr.ac.in","Arya Faculty","faculty"));
    }
    @Test
    void facfunc9() throws SQLException {
        faculty faculty=new faculty();
        ByteArrayInputStream in = new ByteArrayInputStream("9\n8\n".getBytes());
        System.setIn(in);
        assertTrue(faculty.facfunc("faculty@iitrpr.ac.in","Arya Faculty","faculty"));
    }
}