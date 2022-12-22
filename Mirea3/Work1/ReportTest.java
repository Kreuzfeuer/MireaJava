package com.Mirea3.Work1;

import java.util.Scanner;

public class ReportTest {
    public static void main(String[] args) {
        int n = 3;
        Employee[] employes = new Employee[n];
        var in = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter string and double: ");
            employes[i] = new Employee(in.next(),in.nextDouble());
        }
        Report.generateReport(employes);
    }
}
