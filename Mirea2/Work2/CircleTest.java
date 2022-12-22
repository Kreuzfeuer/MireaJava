package com.Mirea2.Work2;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1,2,4);
        var circle2 = new Circle(1,2,4);
        System.out.println(circle1.areaOfCircle());
        System.out.println(circle1.circumference());
        System.out.println(circle1.compareTo(circle2));
        System.out.println(circle1.equals(circle2));

    }
}
