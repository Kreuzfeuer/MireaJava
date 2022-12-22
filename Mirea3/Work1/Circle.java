package com.Mirea3.Work1;


public class Circle {

    private Point centre = new Point();

    private double radius;

    public Circle(double centreX, double centreY, double radius){
        centre.setX(centreX);
        centre.setY(centreY);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getCentreX(){
        return centre.getX();
    }

    public double getCentreY(){
        return centre.getY();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "centre=" + centre +
                ", radius=" + radius +
                '}';
    }
}
