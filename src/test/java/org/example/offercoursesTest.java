package org.example;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class offercoursesTest {

    @Test
    void offerold() throws SQLException {

        offercourses off = new offercourses();
        assertEquals(true,off.offer("faculty@iitrpr.ac.in","Arya Faculty","CS302 6.9"));
    }
    @Test
    void offernot() throws SQLException {

        offercourses off = new offercourses();
        assertEquals(true,off.offer("faculty@iitrpr.ac.in","Arya Faculty","HS203 6.9"));
    }

    @Test
    void offernotss() throws SQLException {

        offercourses off = new offercourses();
        assertEquals(true,off.offer("faculty@iitrpr.ac.in","Arya Faculty","CS505 6.9"));
    }
}