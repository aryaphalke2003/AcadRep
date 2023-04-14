package org.example;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class semsetTest {

    @Test
    void setEnd() throws SQLException {

        semset s = new semset();
        assertEquals(true,s.set("E",-1,-1));
    }
    @Test
    void setStart() throws SQLException {

        semset s = new semset();
        assertEquals(true,s.set("S",2023,2));
    }

    @Test
    void setView() throws SQLException {

        semset s = new semset();
        assertEquals(true,s.set("V",-1,-1));
    }

    @Test
    void setX() throws SQLException {

        semset s = new semset();
        assertEquals(true,s.set("X",-1,-1));
    }
}