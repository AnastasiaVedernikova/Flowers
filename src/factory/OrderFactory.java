package factory;

import order.FlowerBucket;
import order.Order;

/**
 * Created by cs.ucu.edu.ua on 21.11.2016.
 */
public class OrderFactory {
    public Order getBucket(TypeBucket type){
        Order order = new Order();

      if (type.toString().equals("BirthdayBucket")){
            order.addItem(new BirthdayBucket());
            return order;
        }
        else if (type.toString().equals("Funeralbucket")){
            order.addItem(new Funenalbucket());
            return order;
        }
        else if (type.toString().equals("WeedingBucket")){
            order.addItem(new Funenalbucket());
            return order;
        }
        return order;
    }

}
