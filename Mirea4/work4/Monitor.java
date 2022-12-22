package com.Mirea4.work4;

public class Monitor {
    private String name;

    public Monitor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "name='" + name + '\'' +
                '}';
    }
}
