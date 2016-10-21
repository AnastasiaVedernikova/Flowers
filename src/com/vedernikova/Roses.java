package com.vedernikova;

/**
 * Created by cs.ucu.edu.ua on 03.10.2016.
 */
public class Roses extends Flowers {
    public Roses(FlowerSpec spec){
        this.spec = spec;
        spec.name = StyleFlower.ROSE;
        spec.setPrice(20);
    }

}
