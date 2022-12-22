package com.Mirea4.work4;

public class Memory {
    private String name;

    public Memory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "name='" + name + '\'' +
                '}';
    }
}
