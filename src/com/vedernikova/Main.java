package com.vedernikova;

public class Main {

    public static void main(String[] args) {
        Roses rose_1 = new Roses("red",3.5,8);
        Tulips tulips_1 = new Tulips(6.8,"yellow");
        Chamomile chamomile_1 = new Chamomile("white",5,5);
        Roses rose_2 = new Roses("white", 4, 7);
        Bouquet bouquet_1 = new Bouquet();
        bouquet_1.addFlower(tulips_1);
        bouquet_1.addFlower(rose_1);
        bouquet_1.addFlower(chamomile_1);
        bouquet_1.addFlower(rose_2);
        System.out.println(bouquet_1);
        System.out.println(bouquet_1.Prise());
        bouquet_1.SortFreshness();
        System.out.println(bouquet_1);
        System.out.println(bouquet_1.FindSteam(3,20));


	// write your code here
    }
}
