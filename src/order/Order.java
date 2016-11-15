package order;

import com.vedernikova.Bouquet;
import com.vedernikova.Flowers;
import observe.TulipSupplierObserver;
import observe.Observarble;
import observe.RomushkaSupplierObserver;

import java.util.LinkedList;
import java.util.List;
import java.util.Observer;

/**
 * Created by cs.ucu.edu.ua on 07.11.2016.
 */
public class Order extends Observarble {

    public   LinkedList<FlowerBucket> items = new LinkedList<FlowerBucket>();

    public LinkedList getItems() {
        return items;
    }

    public void setItems(LinkedList items) {
        this.items = items;

    }

    public Ipaymant getPayment() {
        return this.payment;
    }

    public void setPayment(Ipaymant payment) {
        this.payment = payment;

    }

    private  Ipaymant payment;

    public Idelivary getDelivary() {
        return this.delivary;
    }

    public void setDelivary(Idelivary delivary) {
        this.delivary = delivary;

    }

    private  Idelivary delivary;
//    public void Order(LinkedList<Bouquet> items, Ipaymant payment, Idelivary delivary){
//
//    }

    public void setPaymentStrategy(Ipaymant payment){
        this.payment = payment;

    }

    public void setDelivaryStrategy(Idelivary delivary){
        this.delivary = delivary;

    }

    public double TotalPrice(){

        double Totalprice = 0.0;
        for( Item i: items){
            Totalprice+= i.price();
        }
        return Totalprice;

    }
    public  String processOrder(){
        if (this.delivary != null){
            return this.delivary.deliver(items);
        }
        if(this.payment != null){
            return this.payment.pay(100.0);
        }
        this.NotifyAllObservers(this.items);
        return "";

    }
    public void addItem(FlowerBucket item){
        this.items.add(item);
        this.NotifyAllObservers(this.items);

    }
    public void removeItem(FlowerBucket item){
        items.remove(item);
        this.NotifyAllObservers(this.items);

    }


}
