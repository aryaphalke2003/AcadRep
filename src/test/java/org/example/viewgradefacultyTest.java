package org.example;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class viewgradefacultyTest {

    @Test
    void view() throws SQLException {
        viewgradefaculty v = new viewgradefaculty();
        assertEquals(true,v.view("CS201","Arya Faculty",2022,1));
    }

    @Test
    void viewnotf() throws SQLException {
        viewgradefaculty v = new viewgradefaculty();
        assertEquals(true,v.view("CS201","Arya Faculty",2002,1));
    }
}