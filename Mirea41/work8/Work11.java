package com.Mirea41.work8;

public class Work11 {
    public static void main(String[] args) {
        Shape s1 = new Circle("red", false, 5.5); // Upcast
        System.out.println(s1);//which version?
        System.out.println(s1.getArea());// which version?
        System.out.println(s1.getPerimetr());//which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isField());
       // System.out.println(s1.getRadius());//
        Circle c1 = (Circle)s1;// Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimetr());
        System.out.println(c1.getColor());
        System.out.println(c1.isField());
        System.out.println(c1.getRadius());
        //Shape s2 = new Shape();
        Shape s3 = new Rectangle("RED", false, 1.0, 2.0);//
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimetr());
        System.out.println(s3.getColor());
       // System.out.println(s3.getLength());
        Rectangle r1 = (Rectangle)s3; //downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        Shape s4 = new Square(6.6);//Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
       // System.out.println(s4.getSide());
/*обратите внимание, что выполняем downcast Shape s4 к
Rectangle, который является суперклассом
Square(родителем), вместо Square */
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide());
        System.out.println(r2.getLength());
// Downcast Rectangle r2 к Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
