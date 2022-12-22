package com.Mirea41.work9;

public class FurnitureShop {
    private Chair[] chairs;

    public FurnitureShop() {
        this.chairs = new Chair[3];
        chairs[0] = new Chair("Blue",35,4);
        chairs[1] = new Chair("Black",50,3);
        chairs[2] = new Chair("White",100,0);
    }
    public void showProducts(){
        for (int i = 0; i < 3; i++) {
            System.out.println( chairs[i]);
        }
    }
}
