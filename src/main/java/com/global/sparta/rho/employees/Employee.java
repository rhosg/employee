package com.global.sparta.rho.employees;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
    //Emp ID,Name Prefix,First Name,Middle Initial,Last Name,E Mail,Date of Birth,Date of Joining,Salary

    private final String empID;
    private String namePrefix;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private String gender;
    private String eMail;
    private final LocalDate dateOfBirth;
    private final LocalDate dateOfJoining;
    private int salary;

    public Employee(String empID, String name_Prefix, String first_Name, String middle_Initial,
                    String last_name, String gender, String e_mail, LocalDate dateOfBirth, LocalDate dateOfJoining, int salary) {

        this.empID = empID;
        this.namePrefix = name_Prefix;
        this.firstName = first_Name;
        this.middleInitial = middle_Initial;
        this.lastName = last_name;
        this.gender = gender;
        this.eMail = e_mail;
        this.dateOfBirth = dateOfBirth;
        this.dateOfJoining = dateOfJoining;
        this.salary = salary;
    }

    public String getEmpID() {
        return empID;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String geteMail() {
        return eMail;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public int getSalary() {
        return salary;
    }


    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return  empID + " "
                + namePrefix + " " + firstName + " "
                + lastName + " " + eMail + " " + dateOfBirth
                + " " + dateOfJoining + " " + salary;
    }

}
