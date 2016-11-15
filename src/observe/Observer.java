package observe;

import java.util.LinkedList;

import order.FlowerBucket;
import order.Item;

/**
 * Created by cs.ucu.edu.ua on 14.11.2016.
 */
abstract interface Observer {
    Observarble subject = new Observarble();
    abstract void update(Observarble s, LinkedList<FlowerBucket> items);
}
