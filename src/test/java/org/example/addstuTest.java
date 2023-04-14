package org.example;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class addstuTest {

    @Test
    void add() throws SQLException {

        addstu c = new addstu();
        assertEquals(true,c.add("student","Student12","student12@iitrpr.ac.in","CSE",2021));
    }

    @Test
    void addag() throws SQLException {

        addstu c = new addstu();
        assertEquals(true,c.add("student","Student12","student12@iitrpr.ac.in","CSE",2021));
    }
}