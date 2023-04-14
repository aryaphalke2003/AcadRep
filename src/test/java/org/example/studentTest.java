package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class studentTest {


    @Test
    void stufunc1() throws SQLException {
        student student=new student();
        ByteArrayInputStream in = new ByteArrayInputStream("1\nCS505 7.0\n9\n".getBytes());
        System.setIn(in);
        assertTrue(student.stufunc("1@iitrpr.ac.in","Student1","student"));
    }

    @Test
    void stufunc2() throws SQLException {
        student student=new student();
        ByteArrayInputStream in = new ByteArrayInputStream("2\nPC\nCS517\n9\n".getBytes());
        System.setIn(in);
        assertTrue(student.stufunc("1@iitrpr.ac.in","Student1","student"));
    }

    @Test
    void stufunc21() throws SQLException {
        student student=new student();
        ByteArrayInputStream in = new ByteArrayInputStream("2\nEC\nGE333\n9\n".getBytes());
        System.setIn(in);
        assertTrue(student.stufunc("1@iitrpr.ac.in","Student1","student"));
    }

    @Test
    void stufunc22() throws SQLException {
        student student=new student();
        ByteArrayInputStream in = new ByteArrayInputStream("2\nPC\nCS517\n9\n".getBytes());
        System.setIn(in);
        assertTrue(student.stufunc("1@iitrpr.ac.in","Student1","student"));
    }

    @Test
    void stufunc222() throws SQLException {
        student student=new student();
        ByteArrayInputStream in = new ByteArrayInputStream("2\nPC\nCS517\n9\n".getBytes());
        System.setIn(in);
        assertTrue(student.stufunc("1@iitrpr.ac.in","Student1","student"));
    }

    @Test
    void stufunc23() throws SQLException {
        student student=new student();
        ByteArrayInputStream in = new ByteArrayInputStream("2\nEC\nCS501\n9\n".getBytes());
        System.setIn(in);
        assertTrue(student.stufunc("1@iitrpr.ac.in","Student1","student"));
    }

    @Test
    void stufunc24() throws SQLException {
        student student=new student();
        ByteArrayInputStream in = new ByteArrayInputStream("2\nES\nHS301\n9\n".getBytes());
        System.setIn(in);
        assertTrue(student.stufunc("1@iitrpr.ac.in","Student1","student"));
    }

    @Test
    void stufunc25() throws SQLException {
        student student=new student();
        ByteArrayInputStream in = new ByteArrayInputStream("2\nPC\nCS111\n9\n".getBytes());
        System.setIn(in);
        assertTrue(student.stufunc("1@iitrpr.ac.in","Student1","student"));
    }

    @Test
    void stufunc26() throws SQLException {
        student student=new student();
        ByteArrayInputStream in = new ByteArrayInputStream("2\nPC\nCS111\n9\n".getBytes());
        System.setIn(in);
        assertTrue(student.stufunc("3@iitrpr.ac.in","Student3","student"));
    }

    @Test
    void stufunc3() throws SQLException {
        student student=new student();
        ByteArrayInputStream in = new ByteArrayInputStream("3\nCS202\n9\n".getBytes());
        System.setIn(in);
        assertTrue(student.stufunc("1@iitrpr.ac.in","Student1","student"));
    }

    @Test
    void stufunc4() throws SQLException {
        student student=new student();
        ByteArrayInputStream in = new ByteArrayInputStream("4\n9\n".getBytes());
        System.setIn(in);
        assertTrue(student.stufunc("1@iitrpr.ac.in","Student1","student"));
    }

    @Test
    void stufunc5() throws SQLException {
        student student=new student();
        ByteArrayInputStream in = new ByteArrayInputStream("5\n9\n".getBytes());
        System.setIn(in);
        assertTrue(student.stufunc("1@iitrpr.ac.in","Student1","student"));
    }

    @Test
    void stufunc6() throws SQLException {
        student student=new student();
        ByteArrayInputStream in = new ByteArrayInputStream("6\n9\n".getBytes());
        System.setIn(in);
        assertTrue(student.stufunc("1@iitrpr.ac.in","Student1","student"));
    }

    @Test
    void stufunc7() throws SQLException {
        student student=new student();
        ByteArrayInputStream in = new ByteArrayInputStream("7\n9\n".getBytes());
        System.setIn(in);
        assertTrue(student.stufunc("1@iitrpr.ac.in","Student1","student"));
    }

    @Test
    void stufunc8() throws SQLException {
        student student=new student();
        ByteArrayInputStream in = new ByteArrayInputStream("8\narya\n9\n".getBytes());
        System.setIn(in);
        assertTrue(student.stufunc("1@iitrpr.ac.in","Student1","student"));
    }

    @Test
    void stufunc9() throws SQLException {
        student student=new student();
        ByteArrayInputStream in = new ByteArrayInputStream("9\n".getBytes());
        System.setIn(in);
        assertTrue(student.stufunc("1@iitrpr.ac.in","Student1","student"));
    }



    @Test
    void stufunc10() throws SQLException {
        student student=new student();
        ByteArrayInputStream in = new ByteArrayInputStream("10\n9\n".getBytes());
        System.setIn(in);
        assertTrue(student.stufunc("1@iitrpr.ac.in","Student1","student"));
    }

}