package com.Mirea4.work4;

public class Computer {
    private Company company;
    private Memory memory;
    private Monitor monitor;
    private Processor processor;

    public Computer(Company company, Memory memory, Monitor monitor, Processor processor) {
        this.company = company;
        this.memory = memory;
        this.monitor = monitor;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "company=" + company +
                ", memory=" + memory +
                ", monitor=" + monitor +
                ", processor=" + processor +
                '}';
    }
}
