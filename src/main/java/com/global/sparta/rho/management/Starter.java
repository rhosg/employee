package com.global.sparta.rho.management;

import com.global.sparta.rho.employees.EmployeeManager;

/**
 * Hello world!
 */
public class Starter {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addToDatebase();

    }
}
