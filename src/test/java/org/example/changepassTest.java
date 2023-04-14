package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class changepassTest {

    @Test
    void cpass() throws SQLException {
        changepass changepass=new changepass();
        assertTrue(changepass.change("1@iitrpr.ac.in","arya"));
    }
}