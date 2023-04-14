package org.example;

import org.junit.jupiter.api.Test;
import org.postgresql.util.PSQLException;

import java.io.IOException;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class viewcompcTest {

    @Test
    void view() throws SQLException, IOException {
        viewcompc v = new viewcompc();
        assertEquals(true,v.view("Student1","1@iitrpr.ac.in"));

    }
}