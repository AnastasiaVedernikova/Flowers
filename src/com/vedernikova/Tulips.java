package com.vedernikova;

/**
 * Created by cs.ucu.edu.ua on 03.10.2016.
 */
public class Tulips extends Flowers {
    public Tulips(FlowerSpec spec){
        this.spec = spec;
        spec.name = StyleFlower.TULIP;

        spec.setStemSize(20);
    }

}
