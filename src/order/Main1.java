package order;

import com.vedernikova.*;

/**
 * Created by cs.ucu.edu.ua on 12.11.2016.
 */
public class Main1 {
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

        FlowerBucket bucket = new FlowerBucket();
        bucket.addFlowers(tulip1);
        bucket.addFlowers(tulip2);
        bucket.addFlowers(chamomile1);
        bucket.addFlowers(rose1);

        FlowerBucket bucket1 = new FlowerBucket();
        bucket1.addFlowers(tulip1);
        bucket1.addFlowers(rose1);

        //decorators
        System.out.println("decorators");

        Item decoration = new BasketDecorator(new PaperDecorator(new RibbonDecorator(new FlowerBucket())));
        System.out.println(decoration.price());
        System.out.println(decoration.getDescription());

        System.out.println("strategy");
         //strategy
        System.out.println(bucket.SearchFlower(20));
        System.out.println(bucket.price());
        System.out.println(bucket1.price());
        Order order = new Order();
        order.addItem(bucket);
        order.addItem(bucket1);
        order.setDelivary(new DHLDelveryStrategy());
        order.setPayment(new CreditCardPaymentStrategy());
        System.out.println(order.getDelivary().deliver(order.items));
        System.out.println(order.processOrder());

        double t = order.TotalPrice();
        System.out.println(t);






//        Bouquet bouquet = new Bouquet();
//        bouquet.addFlower(chamomile1);
//        bouquet.addFlower(rose1);
//        bouquet.addFlower(tulip1);
//        bouquet.addFlower(tulip2);

//
//        FlowerBucket bucket = new FlowerBucket();
//        bucket.addFlowers();
//        Item item = bucket;
//        item = new RibbonDecorator(item);
//        item = new PaperDecorator(item);
    }
}
