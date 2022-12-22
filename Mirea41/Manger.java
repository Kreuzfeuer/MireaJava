package com.Mirea41;

public class Manger extends Employer{
    private double averageSum;

    public Manger(String firstName, String lastName, double income, double averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }

    @Override
    public double getIncome() {
        return super.getIncome()* averageSum ;
    }
}
