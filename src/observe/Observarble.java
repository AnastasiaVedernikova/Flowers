package observe;

/**
 * Created by cs.ucu.edu.ua on 14.11.2016.
 */
public class Observarble {
    public void getState(){
        System.out.println("getstate");
    }
    public void setState(){
        System.out.println("setState");
    }
    public void attach(){System.out.println("attach");}
    public void NotifyAllObservers(){
        System.out.println("notified");
    }

}
