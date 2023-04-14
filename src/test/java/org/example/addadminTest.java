package org.example;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class addadminTest {

    @Test
    void add() throws SQLException {

        addadmin c = new addadmin();
        assertEquals(true,c.add("admin","ad1","ad1@gmail.com","CSE"));
    }

    @Test
    void addag() throws SQLException {

        addadmin c = new addadmin();
        assertEquals(true,c.add("admin","ad1","ad1@gmail.com","CSE"));
    }
}