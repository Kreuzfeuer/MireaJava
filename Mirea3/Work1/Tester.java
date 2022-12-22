package com.Mirea3.Work1;

import java.util.ArrayList;
import java.util.Random;

public class Tester {
    private ArrayList<Circle> circles = new ArrayList<Circle>();

    public Tester(int n ){
        var random = new Random();
        for (int i = 0; i < n; i++) {
            circles.add(new Circle(random.nextDouble(20),random.nextDouble(20),random.nextDouble(20)));
        }
    }

    public Circle findMin(){
        double minR = 21;
        int index = - 1;
        for (int i = 0; i < circles.size(); i++) {
            if (minR > circles.get(i).getRadius()){
                minR = circles.get(i).getRadius();
                index = i;
            }
        }
        return circles.get(index);
    }

    public Circle findMax(){
        double maxR = -1;
        int index = - 1;
        for (int i = 0; i < circles.size(); i++) {
            if (maxR < circles.get(i).getRadius()){
                maxR = circles.get(i).getRadius();
                index = i;
            }
        }
        return circles.get(index);
    }
    public void sort(){
        circles.sort((a,b)->
                (int)(a.getRadius() - b.getRadius())
                );
    }

    @Override
    public String toString() {
        return "Tester{" +
                "circles=" + circles +
                '}';
    }
}
