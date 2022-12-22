package com.Mirea41;

public class ManagerTest {
    public static void main(String[] args) {
        Employer man1 = new Manger("Oleg", "Tver", 13.0, 2);
        System.out.println(man1.getIncome());
        Employer[] mans = new Employer[3];
        mans[0] = man1;
        mans[1] = new Employer("Kiril","Abdul", 14 );
        mans[2] = new Manger("Dul", "Rimba", 12, 2.2);
        for (int i = 0; i < mans.length; i++) {
            System.out.println( mans[i].getIncome());
        }
    }
}
