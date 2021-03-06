package observe;

import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by cs.ucu.edu.ua on 14.11.2016.
 */

import com.vedernikova.Flowers;
import order.FlowerBucket;

public class RomushkaSupplierObserver implements Observer {
    Observable subject;

    public RomushkaSupplierObserver(Observable subject){
        this.subject = subject;
    }


    public void update(Observable s,  Object items) {
        Integer am  = 0;
        for (FlowerBucket bucket : (LinkedList<FlowerBucket>)items) {
            for (Flowers flow : bucket.fl) {
                if (flow.getName().equals("Chamomile")) {
                    am +=1;
                }
            }

        }

        System.out.println("Sent for "+ am + " chamomiles");
    }
}
