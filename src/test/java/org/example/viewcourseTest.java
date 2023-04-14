package org.example;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class viewcourseTest {

    @Test
    void view() throws SQLException {
        viewcourse v = new viewcourse();
        assertEquals(true,v.view());
    }
}