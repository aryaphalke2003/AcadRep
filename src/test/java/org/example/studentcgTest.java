package org.example;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class studentcgTest {


    @Test
    void getcg() throws SQLException {
        studentcg st = new studentcg();
        assertEquals(8.28,st.getcg("Student1","1@iitrpr.ac.in"));
    }
}