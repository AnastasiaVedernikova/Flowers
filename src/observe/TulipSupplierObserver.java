package observe;

import com.vedernikova.Flowers;
import order.FlowerBucket;
import order.Item;

import java.util.LinkedList;

/**
 * Created by cs.ucu.edu.ua on 14.11.2016.
 */

public class TulipSupplierObserver implements Observer{
    Observarble subject;

    Integer amount_cactus;
    public TulipSupplierObserver(Observarble subject){this.subject = subject;
    subject.attach(this);}

    @Override
    public void update(Observarble s, LinkedList<FlowerBucket> items) {
        for (FlowerBucket bucket: items ){
            for (Flowers flow: bucket.fl) {
                if (flow.getName().equals("Tulip")) {
                    int m = flow.getFreshness();
                    
                    if (m>0) {
                        flow.setFreshness(m - 1);
                        System.out.println("old freshness- " + m);
                        System.out.println("new freshness of tulip - " + (m - 1));
                    }
                }
            }

        }
    }
}
