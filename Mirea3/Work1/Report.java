package com.Mirea3.Work1;

public class Report {
    public static void generateReport(Employee[] employees){
        for (int i = 0; i <employees.length; i++) {
            System.out.printf("%-29s %.2f %n", employees[i].getFullname(), employees[i].getSalary());
        }
    }
}
