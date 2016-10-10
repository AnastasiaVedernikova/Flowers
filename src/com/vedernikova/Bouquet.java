package com.vedernikova;

import java.util.Arrays;

/**
 * Created by cs.ucu.edu.ua on 03.10.2016.
 */
public class Bouquet {
    private Flowers[] flowers = new Flowers[1];//list of flowersстворили список з 1 елементу
    private int lastIndex = 0;

    public void addFlower(Flowers nw) { //додаємо елементи
        if (lastIndex < flowers.length) {   //коментарі,стрінг метод, переписувати ерей
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
        for (int i = 0; i < this.flowers.length; i++) {
            prise += this.flowers[i].getPrice();
        }
        return prise;
    }

    public void SortFreshness() {
        Arrays.sort(flowers, (a, b) -> Integer.compare(a.freshness, b.freshness));
    }

    public String FindSteam(int start_steam, int end_stem) {
        for (int i = 0; i < flowers.length; i++) {
            if (start_steam < this.flowers[i].stem_length && this.flowers[i].stem_length < end_stem) {
                return this.flowers[i].name + this.flowers[i].color;
            }
        }
        return "";
    }
}