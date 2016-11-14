package com.vedernikova;

/**
 * Created by cs.ucu.edu.ua on 31.10.2016.
 */
public class Tuple1<K,V extends Comparable<V>> implements Comparable<Tuple1<K,V>>{
    private K x;
    private V y;
    Tuple1(K x, V y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "("+ x.toString()+","+ y.toString()+")";
    }
    @Override
    public int compareTo(Tuple1<K,V> o){
        return this.y.compareTo(o.y);
    }



}
