package com.vedernikova;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by cs.ucu.edu.ua on 03.10.2016.
 */
public  class Flowers{
    //public Flowers(FlowerSpec spec){
   //     this.spec = spec;
               // Arrays.copyOf(spec);///????
  //  }

    protected FlowerSpec spec;
    private FlowerSpec getFlowerSpec(){
        return spec;
    }


    public FlowerColor getColor() {
        return spec.color;
    }

    public void setColor(FlowerColor color) {
        spec.setColor(color);
    }



    public int getFreshness() {
        return spec.getFreshness();
    }

    public void setFreshness(int freshness) {
        spec.setFreshness(freshness);
    }




    public void setPrice(int price) {
        spec.setPrice(price);
    }

    public int getPrice() {
        return spec.getPrice();
    }

    public double getStemlength() {
        return spec.getStemlength();
    }

    public void setStemSize(double stemlength){
        spec.setStemSize(stemlength);
    }
    public String getName(){
        return spec.getName();
    }
    public String toString() {
        return spec.getColor() + " " + spec.name;

    }

}
