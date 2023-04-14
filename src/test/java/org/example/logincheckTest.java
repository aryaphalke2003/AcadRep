package org.example;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class logincheckTest {

    @Test
    void checkyes() throws SQLException {

        logincheck c = new logincheck();
        assertEquals("1,student,Student1",c.check("1@iitrpr.ac.in","arya"));

    }

    @Test
    void checkpwd() throws SQLException {

        logincheck c = new logincheck();
        assertEquals("nopwd",c.check("1@iitrpr.ac.in","arysdfsa"));

    }

    @Test
    void checkuser() throws SQLException {

        logincheck c = new logincheck();
        assertEquals("nouser",c.check("sdf","arya"));

    }
}