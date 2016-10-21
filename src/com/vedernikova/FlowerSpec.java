package com.vedernikova;

/**
 * Created by cs.ucu.edu.ua on 17.10.2016.
 */
public class FlowerSpec {
    protected double stemlength;

    protected int price;

    protected int freshness;

    protected FlowerColor color;
    protected StyleFlower name;
    public FlowerColor getColor() {
        return color;
    }

    public void setColor(FlowerColor color) {
        this.color = color;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }



    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public double getStemlength() {
        return stemlength;
    }

    public void setStemSize(double stemlength){
        this.stemlength = stemlength;
    }
    public String getName(){
        return name.toString();
    }
    public String toString() {
        return this.color + " " + this.name;
    }

}
