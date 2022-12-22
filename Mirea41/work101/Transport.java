package com.Mirea41.work101;

public abstract class Transport {
    protected double speed;
    protected double priceForBag;
    protected double priceForMan;

    public Transport(double speed, double priceForBag, double priceForMan) {
        this.speed = speed;
        this.priceForBag = priceForBag;
        this.priceForMan = priceForMan;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getPriceForBag() {
        return priceForBag;
    }

    public void setPriceForBag(double priceForBag) {
        this.priceForBag = priceForBag;
    }

    public double getPriceForMan() {
        return priceForMan;
    }

    public void setPriceForMan(double priceForMan) {
        this.priceForMan = priceForMan;
    }
    public void getInfo(){
        System.out.println( "Time for 1 km " + 1000/ speed + " Price for man - " +
      priceForMan + " Price for bag - " + priceForBag);
    };
}
