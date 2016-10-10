package com.vedernikova;

/**
 * Created by cs.ucu.edu.ua on 03.10.2016.
 */
public class Roses extends Flowers {
    public Roses(String color, double stem_length, int freshness){
        this.name = "rose ";
        this.color = color;
        this.stem_length = stem_length;
        this.freshness = freshness;
        this.price = 30;
    }
    public boolean hasSpikes(){
        return true;
    }
}
