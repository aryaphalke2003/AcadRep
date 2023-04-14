package org.example;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class uploadgradeTest {

    @Test
    void upload() throws SQLException {
        uploadgrade u = new uploadgrade();
        assertEquals(true,u.upload("Arya Faculty","CS301"));
    }
}