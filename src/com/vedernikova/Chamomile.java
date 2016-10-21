package com.vedernikova;

/**
 * Created by cs.ucu.edu.ua on 05.10.2016.
 */
public class Chamomile extends Flowers {
    public Chamomile(FlowerSpec spec) {
        this.spec = spec;
        spec.name = StyleFlower.CHAMOMILE;
        spec.setPrice(35);
    }
}

