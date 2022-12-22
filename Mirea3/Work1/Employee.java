package com.Mirea3.Work1;

public class Employee {

    private String fullname;
    private double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public Employee(){};
    public String getFullname() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }

}
