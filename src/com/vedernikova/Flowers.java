package com.vedernikova;

/**
 * Created by cs.ucu.edu.ua on 03.10.2016.
 */
public abstract class Flowers {
    protected double stem_length = 0;

    protected int price = 0;

    protected int freshness = 0;

    protected String color = "";
    protected String name = "";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
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

    public double getStem_length() {
        return stem_length;
    }

    public void setStemSize(double stem_length){
        this.stem_length = stem_length;
    }
    public String toString() {
        return this.color + " " + this.name;
    }
    abstract public boolean hasSpikes();

}
