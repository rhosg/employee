package com.global.sparta.rho.display;

import com.global.sparta.rho.employees.Employee;

import java.sql.*;
import java.util.List;


public class DAO {
    private final String QUERY = "INSERT INTO employees VALUES(?,?,?,?,?,?,?,?,?,?)";

    private final String URL = "jdbc:mysql://localhost/Employees?user=root&password=";

    public void runSQLQuery(List<Employee> employees) {
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


}


