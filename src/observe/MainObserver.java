package observe;

import com.vedernikova.*;
import order.FlowerBucket;
import order.Order;

/**
 * Created by cs.ucu.edu.ua on 15.11.2016.
 */
public class MainObserver {
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
        spec2.setFreshness(20);
        Tulips tulip1 = new Tulips(spec2);


        FlowerSpec spec3 = new FlowerSpec();
        spec3.setColor(FlowerColor.RED);
        spec3.setFreshness(30);
        Tulips tulip2 = new Tulips(spec3);

        FlowerBucket bucket = new FlowerBucket();
        bucket.addFlowers(tulip1);
        bucket.addFlowers(tulip2);
        bucket.addFlowers(chamomile1);
        bucket.addFlowers(rose1);

        FlowerBucket bucket1 = new FlowerBucket();
        bucket1.addFlowers(tulip1);
        bucket1.addFlowers(rose1);

        Order order = new Order();
        order.addItem(bucket);
        order.addItem(bucket1);

        TulipSupplierObserver observer1 = new TulipSupplierObserver(order);
        RomushkaSupplierObserver observer2 = new RomushkaSupplierObserver(order);
        System.out.println(order.observers);

        order.removeItem(bucket);
        System.out.println(bucket1.fl);
        System.out.println(order.items.size());

        order.addItem(bucket);

    }

}
