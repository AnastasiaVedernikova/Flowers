package observe;

import com.vedernikova.*;
import factory.OrderFactory;
import factory.TypeBucket;
import order.FlowerBucket;
import order.Order;

/**
 * Created by cs.ucu.edu.ua on 15.11.2016.
 */
public class MainObserver {
    public static void main(String[] args) {
        Order order = new OrderFactory().getBucket(TypeBucket.BirthdayBucket);
        System.out.println(order.processOrder());

    }

}
