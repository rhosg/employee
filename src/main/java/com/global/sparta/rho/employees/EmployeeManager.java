package com.global.sparta.rho.employees;

import com.global.sparta.rho.display.DAO;

public class EmployeeManager {


    public void addToDatebase() {
        FileReader fileReader = new FileReader();
        fileReader.readFile();
        new DAO().addToDatabase(fileReader.returnArray());

    }
}
