package org.example;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class gradcheckTest {

    @Test
    void chek() throws SQLException {
        gradcheck g = new gradcheck();
        assertEquals(true,g.chek("Student1","1@iitrpr.ac.in"));
    }
}