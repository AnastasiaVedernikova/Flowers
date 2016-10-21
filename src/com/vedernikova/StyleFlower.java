package com.vedernikova;

/**
 * Created by cs.ucu.edu.ua on 17.10.2016.
 */
public enum StyleFlower {
    CHAMOMILE,TULIP,ROSE;
    public String toString(){
    String a;
        switch (this){
            case CHAMOMILE:
                a =  "Chamomile";break;
            case TULIP:
                a =  "Tulip";break;
            case ROSE:
                a =  "Rose";break;
            default:
                a =  "no color";
    }
        return a;
    }

}
