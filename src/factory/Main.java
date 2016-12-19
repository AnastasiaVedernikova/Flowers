package factory;

import order.Order;

/**
 * Created by cs.ucu.edu.ua on 19.12.2016.
 */
public class Main {
    public static void main(String args[]){
        OrderFactory orderFactory = new OrderFactory();
        Order order = orderFactory.getBucket(TypeBucket.BirthdayBucket);
    }
}
