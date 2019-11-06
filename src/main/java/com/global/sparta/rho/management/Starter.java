package com.global.sparta.rho.management;

import com.global.sparta.rho.display.DAO;
import com.global.sparta.rho.employees.Employee;
import com.global.sparta.rho.employees.EmployeeManager;
import com.global.sparta.rho.employees.FileReader;

/**
 * Hello world!
 *
 */
public class Starter
{
    public static void main( String[] args )
    {
//        EmployeeManager displayManager = new EmployeeManager();
//        displayManager.display();
//        System.out.println();

        FileReader fileReader = new FileReader();
        fileReader.readFile();
        new DAO().addToDatabase(fileReader.returnArray());

    }
}
