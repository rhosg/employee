package com.global.sparta.rho.employees;


import java.time.LocalDate;


public class Employee {
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

    public void setGender(String gender) {
        this.gender = gender;
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
