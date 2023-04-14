package org.example;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class deregoffTest {

    @Test
    void dereg() throws SQLException {
        deregoff d = new deregoff();
        assertEquals(true,d.dereg("Arya Faculty","CS203"));
    }
}