package factory;

import com.vedernikova.*;
import order.FlowerBucket;

/**
 * Created by cs.ucu.edu.ua on 21.11.2016.
 */
public class BirthdayBucket extends FlowerBucket {
    public BirthdayBucket(){
        FlowerSpec spec = new FlowerSpec();
        spec.setFreshness(20);
        spec.setColor(FlowerColor.RED);
        Roses rose1 = new Roses(spec);
//        System.out.println(rose1);


        FlowerSpec spec1 = new FlowerSpec();
        spec1.setFreshness(5);
        spec1.setColor(FlowerColor.RED);
        Tulips tulip1 = new Tulips(spec1);
        //System.out.println(chamomile1);

        FlowerSpec spec2 = new FlowerSpec();
        spec2.setColor(FlowerColor.RED);
        Tulips tulip2 = new Tulips(spec2);


        FlowerSpec spec3 = new FlowerSpec();
        spec3.setColor(FlowerColor.RED);
        Tulips tulip3 = new Tulips(spec3);

        FlowerBucket bucket = new FlowerBucket();
        bucket.addFlowers(tulip1);
        bucket.addFlowers(tulip2);
        bucket.addFlowers(tulip3);
        bucket.addFlowers(rose1);

        FlowerBucket bucket1 = new FlowerBucket();
        bucket1.addFlowers(tulip1);
        bucket1.addFlowers(rose1);
    }
}
