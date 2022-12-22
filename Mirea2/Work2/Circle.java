package com.Mirea2.Work2;

import java.util.Comparator;
import java.util.Objects;

public class Circle implements Comparable {

    private double xCentre;
    private double yCentre;
    private double radius;


    public Circle(double xCentre, double yCentre, double radius) {
        this.xCentre = xCentre;
        this.yCentre = yCentre;
        this.radius = radius;
    }

    public double getXCentre() {
        return xCentre;
    }

    public void setXCentre(double xCentre) {
        this.xCentre = xCentre;
    }

    public double getYCentre() {
        return yCentre;
    }

    public void setYCentre(double yCentre) {
        this.yCentre = yCentre;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double areaOfCircle(){
        return Math.PI * Math.pow(radius,2);
    }

    public double circumference(){
        return 2 * Math.PI * radius;
    }
    @Override
    public int compareTo(Object o){
        Circle circle = (Circle) o;
        return (int) (this.radius - circle.getRadius());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.xCentre, xCentre) == 0 && Double.compare(circle.yCentre, yCentre) == 0 && Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCentre, yCentre, radius);
    }


}
