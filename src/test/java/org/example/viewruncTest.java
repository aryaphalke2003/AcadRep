package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class viewruncTest {

    @Test
    void view() throws SQLException, IOException {
        viewrunc v = new viewrunc();
        assertEquals(true,v.view("Student1","1@iitrpr.ac.in"));
    }
}