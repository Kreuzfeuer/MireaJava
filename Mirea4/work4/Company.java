package com.Mirea4.work4;

public enum Company {
    HP("HP"), ASUS("ASUS"), ACER("ACER");
    private String name;

    Company(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                '}';
    }
}
