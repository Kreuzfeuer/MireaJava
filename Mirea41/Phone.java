package com.Mirea41;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(){}

    private Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String caller){
        System.out.println( "Звонит " + caller);
    }

    public void receiveCall(String caller, String number){
        System.out.println( "Звонит " + caller + ", номер - " + number);
    }

    public void sendMessage(String ...a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }
}
