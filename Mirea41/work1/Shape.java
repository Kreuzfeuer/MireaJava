package com.Mirea41.work1;

public abstract class Shape {
    private String name ;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();
    public abstract double getPerimetr();
    public String getType(){
        return "Shape";
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}
