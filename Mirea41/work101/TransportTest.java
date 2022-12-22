package com.Mirea41.work101;

public class TransportTest {
    public static void main(String[] args) {
        var c = new Car(60,40,65);
        c.getInfo();
        var s = new Ship(100,5,25);
        s.getInfo();
        var t = new Train(80,2,10);
        t.getInfo();
        var a = new Airplane(1000, 150,100);
        a.getInfo();
    }
}
