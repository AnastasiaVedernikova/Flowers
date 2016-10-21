package com.vedernikova;

import java.util.Arrays;

/**
 * Created by cs.ucu.edu.ua on 03.10.2016.
 */
public class Bouquet {
    private Flowers[] flowers = new Flowers[1];
    private int lastIndex = 0;

    public void addFlower(Flowers nw) {
        if (lastIndex < flowers.length) {
            flowers[lastIndex] = nw;
            lastIndex += 1;
        } else {
            Flowers[] newflowers = new Flowers[flowers.length + 1];
            for (int i = 0; i < flowers.length; i++) {
                newflowers[i] = flowers[i];
            }
            flowers = newflowers;
            flowers[lastIndex] = nw;
            lastIndex += 1;
        }
    }

    public String toString() {
        return Arrays.toString(flowers);
    }

    public Integer Prise() {
        int prise = 0;
        for (Flowers i : this.flowers){
            prise += i.getPrice();
        }
        return prise;
    }

    public void SortFreshness() {
        Arrays.sort(flowers, (a, b) -> Integer.compare(a.getFreshness(), b.getFreshness()));
    }

    public String FindSteam(int startsteam, int endstem) {
        for (Flowers i: this.flowers) {
            if (startsteam < i.getStemlength() && i.getStemlength() < endstem) {
                return i.getColor() + " " + i.getName();
            }
        }
        return "";
    }

    public Flowers[] search(FlowerSpec spec) {
        int k = 0;
        int lastind = 0;
        Flowers[] fl = new Flowers[1];
        for (Flowers i : this.flowers) {
            if (i.getColor().equals(spec.getColor())) {
                k += 1;
            }
            if (i.getName().equals(spec.getName())) {
                k += 1;
            }
            if (i.getStemlength() == spec.getStemlength()) {
                k += 1;
            }
            if (i.getFreshness() == spec.getFreshness()) {
                k += 1;
            }
            if (i.getPrice() == spec.getPrice()) {
                k += 1;
            }
            if (k == 5) {
                if (lastind < fl.length) {
                    fl[lastind] = i;
                    lastind += 1;
                    k = 0;
                }else{
                    Flowers[] flo = new Flowers[lastind+1];
                    flo = Arrays.copyOf(fl,fl.length+1);
                    fl = flo;
                    fl[fl.length-1] = i;
                    lastind +=1;
                    k = 0;
                }

                }
            }
            return fl;
        }
}




