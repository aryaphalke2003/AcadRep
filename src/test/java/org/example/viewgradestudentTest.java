package org.example;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class viewgradestudentTest {

    @Test
    void view() throws SQLException {

        viewgradestudent v = new viewgradestudent();
        assertEquals(true,v.view("1@iitrpr.ac.in"));
    }
}