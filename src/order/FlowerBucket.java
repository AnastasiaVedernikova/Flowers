package order;

import com.vedernikova.Flowers;

import java.util.LinkedList;

/**
 * Created by cs.ucu.edu.ua on 12.11.2016.
 */
public class FlowerBucket extends Item {
    public LinkedList<Flowers> fl = new LinkedList<Flowers>();
//    private FlowerBucket(LinkedList<Flowers> fl){
//        this.fl = fl;
//    }
//    public  FlowerBucket(){
//
//    }

    public double price(){
        double total = 0;
        for (Flowers i: fl){
            total+=i.getPrice();
        }
        return total;
    }
    public String SearchFlower(double price){
        for (Flowers i: fl){
            if (i.getPrice() == price){
                return i.toString();
            }
        }
        return "";

    }
    public void addFlowers(Flowers flower){
        fl.add(flower);

      //  System.out.println("flower is added");

    }
}
