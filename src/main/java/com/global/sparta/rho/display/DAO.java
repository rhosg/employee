package com.global.sparta.rho.display;

import com.global.sparta.rho.employees.Employee;
import com.global.sparta.rho.employees.FileReader;

import java.sql.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;


public class DAO {
    private final String QUERY = "INSERT INTO employees VALUES(?,?,?,?,?,?,?,?,?,?)";
    private int index = 0;
    private final String URL = "jdbc:mysql://localhost/Employees?user=root&password=";


    public void runSQLQuery(Employee[] employees) {
        try (Connection connection = DriverManager.getConnection(URL)) {
            PreparedStatement statement = connection.prepareStatement(QUERY);
            for (Employee employee : employees) {
                statement.setString(1, employee.getEmpID());
                statement.setString(2, employee.getNamePrefix());
                statement.setString(3, employee.getFirstName());
                statement.setString(4, employee.getMiddleInitial());
                statement.setString(5, employee.getLastName());
                statement.setString(6, employee.getGender());
                statement.setString(7, employee.geteMail());
                statement.setDate(8, Date.valueOf(employee.getDateOfBirth()));
                statement.setDate(9, Date.valueOf(employee.getDateOfJoining()));
                statement.setInt(10, employee.getSalary());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void addToDatabase(Map<String, Employee> employeeMap) {
        Employee[] employeeArray = employeeMap.values().toArray(new Employee[employeeMap.size()]);
        int employeeCount = employeeArray.length;
        Thread[] threads = new Thread[100];
        int threadCount = threads.length;
        for (int i = 0; i < threads.length; i++) {
            final int j = i;
            Runnable runnable;
            if ((employeeCount*(i + 1))/threadCount > employeeCount) {
                runnable = () -> runSQLQuery(Arrays.copyOfRange(employeeArray, ((employeeCount * j) / threadCount), employeeCount));
            } else {
                runnable = () -> runSQLQuery(Arrays.copyOfRange(employeeArray, (employeeCount * j) / threadCount, (employeeCount * (j+1)) / threadCount));
            }
            threads[i] = new Thread(runnable);
            threads[i].start();
        }
    }

}


