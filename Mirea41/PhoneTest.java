package com.Mirea41;

public class PhoneTest {
    public static void main(String[] args) {
        var a = new Phone("12345679","phone", 135);
        var b = new Phone("12345671","phone", 135);
        var c = new Phone("12345678","phone", 135);
        System.out.println(c.getNumber() + "\t" + a.getNumber() + "\t" + b.getNumber());
        System.out.println();
        c.receiveCall("oleg","124151");
    }
}
