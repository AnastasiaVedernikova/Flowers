package com.vedernikova;

/**
 * Created by cs.ucu.edu.ua on 31.10.2016.
 */
public class MainTuple {
    public static void main(String[] args) {
        Tuple1<Bouquet, Bouquet>[] tup = new Tuple1[3];
        tup[0]= new Tuple1<Bouquet,Bouquet>(new Bouquet(),new Bouquet());
        tup[1]= new Tuple1<Bouquet,Bouquet>(new Bouquet(),new Bouquet());



    }

}
