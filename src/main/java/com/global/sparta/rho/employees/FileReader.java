package com.global.sparta.rho.employees;


import com.global.sparta.rho.display.DAO;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class FileReader {
    private final String PATH = "resources/EmployeeRecords.csv";
    private List<Employee> employees;
    private DAO dao = new DAO();
    private Employee employee;
    private BufferedReader br;
    private DateTimeFormatter dateTimeFormatter;


    public void readFile() {
        File file = new File(PATH);
        try {
            java.io.FileReader fileRead = new java.io.FileReader(file);
            br = new BufferedReader(fileRead);
            employees = new ArrayList<>();
            String line = "";
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] employeeCharacteristics = line.split(",");
                dateTimeFormatter = DateTimeFormatter.ofPattern("M/d/yyyy");
                employee = new Employee((employeeCharacteristics[0]), employeeCharacteristics[1]
                        , employeeCharacteristics[2], employeeCharacteristics[3]
                        , employeeCharacteristics[4], employeeCharacteristics[5]
                        , employeeCharacteristics[6], LocalDate.parse(employeeCharacteristics[7], dateTimeFormatter)
                        , LocalDate.parse(employeeCharacteristics[8], dateTimeFormatter), Integer.parseInt(employeeCharacteristics[9]));
                employees.add(employee);
            }


        } catch (FileNotFoundException e) {
            System.out.println("File cannot be found: " + file.toString());
        } catch (IOException e) {
            System.out.println("File cannot be read: " + file.toString());
        } finally {
            if (br != null) {
                try {
                    br.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void addToDatebase() {

        dao.runSQLQuery(employees);

    }

}
