package com.Mirea4.work4;

public class CompTest {
    public static void main(String[] args) {
        Computer computer = new Computer(Company.HP, new Memory("ddr4"),new Monitor("ips"),new Processor("AM4"));
        System.out.println(computer);
    }
}
