package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class viewofferstuTest {

    @Test
    void viewPC() throws SQLException, IOException {
        viewofferstu v = new viewofferstu();
        assertEquals(true,v.view("PC"));
    }


}