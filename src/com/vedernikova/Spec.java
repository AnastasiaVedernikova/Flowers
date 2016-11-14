package com.vedernikova;

/**
 * Created by cs.ucu.edu.ua on 24.10.2016.
 */
abstract public class Spec {
    private  FlowerColor color;
    protected double price;

    Spec(FlowerColor color, double price){
        this.color = color;
        this.price = price;
    }
}
