package com.vedernikova;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        FlowerSpec spec = new FlowerSpec();
        spec.setFreshness(20);
        spec.setColor(FlowerColor.BLUE);
        Roses rose1 = new Roses(spec);
//        System.out.println(rose1);


        FlowerSpec spec1 = new FlowerSpec();
        spec1.setFreshness(5);
        spec1.setColor(FlowerColor.GREEN);
        Chamomile chamomile1 = new Chamomile(spec1);
        //System.out.println(chamomile1);

        FlowerSpec spec2 = new FlowerSpec();
        spec2.setColor(FlowerColor.RED);
        Tulips tulip1 = new Tulips(spec2);


        FlowerSpec spec3 = new FlowerSpec();
        spec3.setColor(FlowerColor.RED);
        Tulips tulip2 = new Tulips(spec3);

        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(chamomile1);
        bouquet.addFlower(rose1);
        bouquet.addFlower(tulip1);
        bouquet.addFlower(tulip2);


        bouquet.SortFreshness();
        System.out.println(bouquet);
        System.out.println(Arrays.toString(bouquet.search(spec2)));



    }
}
