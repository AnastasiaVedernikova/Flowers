package observe;

import order.FlowerBucket;
import order.Item;
import order.Order;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by cs.ucu.edu.ua on 14.11.2016.
 */
public class Observarble {
    public ArrayList<Observer> observers = new ArrayList<Observer>();
    String state;

    public String getState(){
        System.out.println("getstate");
        return this.state;
    }

    public void setState(String State){
        this.state = State;
        System.out.println("setState");
    }

    public void attach(Observer observer) {
        System.out.println("attach");
        this.observers.add(observer);

    }

    public void NotifyAllObservers(LinkedList<FlowerBucket> b){
        System.out.println("notified");
        for (Observer ob : observers) {
            ob.update(this,b);

        }
    }

}
