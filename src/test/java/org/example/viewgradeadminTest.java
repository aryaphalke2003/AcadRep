package org.example;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class viewgradeadminTest {

    @Test
    void view() throws SQLException {

        viewgradeadmin v = new viewgradeadmin();
        assertEquals(true,v.view("CS201",2022,1));
    }

    @Test
    void viewl() throws SQLException {

        viewgradeadmin v = new viewgradeadmin();
        assertEquals(true,v.view("CS201",2002,1));
    }


}