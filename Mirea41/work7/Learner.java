package com.Mirea41.work7;

public class Learner {
    private String name;

    public Learner(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Learner{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
