package com.global.sparta.rho;

import com.global.sparta.rho.employees.FileReader;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.Assert.*;


public class AppTest {
    FileReader fileReader;

    @Before
    public void setup() {
        fileReader = new FileReader();
    }

    @Test(expected = FileNotFoundException.class)
    public void testFileNotFound() {
        File file = new File("resources/testemploys");
        fileReader.readFile();
    }

    @Test(expected = IOException.class)
    public void testFileCannotBeRead() {
    }


    @Test
    public void testConnection() throws SQLException {
        String URL = "jdbc:mysql://localhost/Employees?user=root&password=";
        Connection connection = DriverManager.getConnection(URL);
        assertNotNull(connection);
    }

    @Test
    public void testQuery() {
        String QUERY = "SELECT * FROM employees";
        fileReader.readFile();
    }
}
