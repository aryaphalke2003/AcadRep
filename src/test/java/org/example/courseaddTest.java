package org.example;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class courseaddTest {

    @Test
    void add() throws SQLException {

        courseadd c = new courseadd();
        assertEquals(true,c.add("CS706 CSE PC 4 4-3-2 CS201,CS301"));
    }

    @Test
    void addag() throws SQLException {

        courseadd c = new courseadd();
        assertEquals(true,c.add("CS505 CSE  EC 4 4-3-2 CS201,CS301"));
    }
}