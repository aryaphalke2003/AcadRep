package org.example;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class registerTest {
    @Test
    void regnotincata() throws SQLException {

        register re = new register();
        assertEquals(true,re.reg("1@iitrpr.ac.in","Student1","CYSSS","ES"));
    }




    @Test
    void regPassed() throws SQLException {

        register re = new register();
        assertEquals(true,re.reg("1@iitrpr.ac.in","Student1","GE111","EC"));
    }

    @Test
    void yeeffe() throws SQLException {

        register re = new register();
        assertEquals(true,re.reg("1@iitrpr.ac.in","Student1","GE111","EC"));
    }
    @Test
    void reoffe() throws SQLException {

        register re = new register();
        assertEquals(true,re.reg("1@iitrpr.ac.in","Student1","CS333","PC"));
    }

    @Test
    void regPC() throws SQLException {
        //not in course catalog
        register re = new register();
        assertEquals(true,re.reg("1@iitrpr.ac.in","Student1","GE333","EC"));
    }
    @Test
    void regnew() throws SQLException {
        //not in course catalog
        register re = new register();
        assertEquals(true,re.reg("1@iitrpr.ac.in","Student1","CS111","PC"));
    }

    @Test
    void regnewes() throws SQLException {
        //not in course catalog
        register re = new register();
        assertEquals(true,re.reg("1@iitrpr.ac.in","Student1","HS301","ES"));
    }

    @Test
    void regodeEC() throws SQLException {
        //not in course catalog
        register re = new register();
        assertEquals(true,re.reg("1@iitrpr.ac.in","Student1","CS502","PC"));
    }
    @Test
    void regodePC() throws SQLException {
        //not in course catalog
        register re = new register();
        assertEquals(true,re.reg("1@iitrpr.ac.in","Student1","CS302","PC"));
    }
    @Test
    void regodePsdfC() throws SQLException {
        //not in course catalog
        register re = new register();
        assertEquals(true,re.reg("1@iitrpr.ac.in","Student1","CS201","PC"));
    }

}