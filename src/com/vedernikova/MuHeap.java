package com.vedernikova;

import java.util.Objects;

/**
 * Created by cs.ucu.edu.ua on 24.10.2016.
 */
class Tuple implements Comparable{
    private int x = 10;
    private int y = 10;

    public Tuple(int x){
        this.x = x;
    }
    @Override
    public  int compareTo(Object o){
        return this.x - ((Tuple)o).x;
    }

}
