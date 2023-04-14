package org.example;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class studeregTest {

    @Test
    void dereg() throws SQLException {
        studereg s = new studereg();
        assertEquals(true,s.dereg("1@iitrpr.ac.in","CS301"));
    }
}