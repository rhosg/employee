package com.global.sparta.rho.employees;


import com.global.sparta.rho.employees.FileReader;

public class EmployeeManager {
    public void display() {
        FileReader fileReader = new FileReader();
        fileReader.readFile();
        fileReader.addToDatebase();
    }
}
