package com.vedernikova;

/**
 * Created by cs.ucu.edu.ua on 17.10.2016.
 */
public enum FlowerColor {
    RED,GREEN,BLUE;
    public String toString(){
        String a;
        switch (this){
            case GREEN:
                a =  "Green";break;
            case RED:
                a =  "Red";break;
            case BLUE:
                a =  "Blue";break;
            default:
                a =  "no color";
        }
        return a;
    }
}
