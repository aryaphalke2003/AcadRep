package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class viewofferfacTest {

    @Test
    void view() throws SQLException, IOException {
        viewofferfac v = new viewofferfac();
        assertEquals(true,v.view("Arya Faculty"));
    }
}