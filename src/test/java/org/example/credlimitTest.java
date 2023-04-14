package org.example;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class credlimitTest {

    @Test
    void get() throws SQLException {
        credlimit c = new credlimit();
        assertEquals(18,c.get("1@iitrpr.ac.in","Student1"));
    }
}