package org.example;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class addfacTest {

    @Test
    void add() throws SQLException {

        addfac c = new addfac();
        assertEquals(true,c.add("faculty","facfac","facfac@gmail.com","CSE"));
    }

    @Test
    void addag() throws SQLException {

        addfac c = new addfac();
        assertEquals(true,c.add("faculty","facfac","facfac@gmail.com","CSE"));
    }
}