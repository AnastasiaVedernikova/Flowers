package factory;

import com.vedernikova.FlowerColor;
import com.vedernikova.FlowerSpec;
import com.vedernikova.Roses;
import com.vedernikova.Tulips;
import order.FlowerBucket;

/**
 * Created by cs.ucu.edu.ua on 21.11.2016.
 */
public class Funenalbucket extends FlowerBucket {
    public Funenalbucket(){
        FlowerSpec spec = new FlowerSpec();
        spec.setFreshness(20);
        spec.setColor(FlowerColor.RED);
        Roses rose1 = new Roses(spec);
//        System.out.println(rose1);


        FlowerSpec spec1 = new FlowerSpec();
        spec1.setFreshness(5);
        spec1.setColor(FlowerColor.RED);
        Roses rose2 = new Roses(spec1);
        //System.out.println(chamomile1);

        FlowerSpec spec2 = new FlowerSpec();
        spec2.setColor(FlowerColor.RED);
        Roses rose3 = new Roses(spec2);


        FlowerSpec spec3 = new FlowerSpec();
        spec3.setColor(FlowerColor.RED);
        Roses rose4 = new Roses(spec3);

        FlowerBucket bucket = new FlowerBucket();
        bucket.addFlowers(rose1);
        bucket.addFlowers(rose2);
        bucket.addFlowers(rose3);
        bucket.addFlowers(rose4);

        FlowerBucket bucket1 = new FlowerBucket();
        bucket1.addFlowers(rose1);
        bucket1.addFlowers(rose2);
        bucket1.addFlowers(rose3);
        bucket1.addFlowers(rose4);
    }
}
