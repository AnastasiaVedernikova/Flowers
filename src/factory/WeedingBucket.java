package factory;

import com.vedernikova.*;
import order.FlowerBucket;

/**
 * Created by cs.ucu.edu.ua on 21.11.2016.
 */
public class WeedingBucket extends FlowerBucket {
    public WeedingBucket(){
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
        spec2.setFreshness(20);
        Tulips tulip1 = new Tulips(spec2);


        FlowerSpec spec3 = new FlowerSpec();
        spec3.setColor(FlowerColor.RED);
        spec3.setFreshness(30);
        Tulips tulip2 = new Tulips(spec3);

        FlowerSpec spec4 = new FlowerSpec();
        spec3.setColor(FlowerColor.RED);
        spec3.setFreshness(30);
        Tulips tulip3 = new Tulips(spec4);

        FlowerBucket bucket = new FlowerBucket();
        bucket.addFlowers(tulip1);
        bucket.addFlowers(tulip2);
        bucket.addFlowers(chamomile1);
        bucket.addFlowers(rose1);
        bucket.addFlowers(tulip3);
    }

}
