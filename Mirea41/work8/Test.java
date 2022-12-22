package com.Mirea41.work8;

public class Test {
    public static void main(String[] args) {
        var a = new Rectangle();
        a.setColor("Black");
        a.setField(true);
        a.setWidth(5);
        a.setLength(4);
        System.out.println(a.getArea() + " " + a.getPerimetr());
        System.out.println(a);

        var r = new Circle("White",false,5);
        System.out.println(r.getArea() + " " + r.getPerimetr());
        System.out.println(r);

        var s = new Square("Green",true,5);
        System.out.println(s);
    }
}
