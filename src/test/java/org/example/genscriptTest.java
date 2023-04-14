package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class genscriptTest {

    @Test
    void gen() throws SQLException, IOException {
        genscript g = new genscript();
        assertEquals(true,g.gen("1@iitrpr.ac.in","Student1"));
    }
}