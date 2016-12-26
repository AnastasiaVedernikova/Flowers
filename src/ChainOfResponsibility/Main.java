package ChainOfResponsibility;

/**
 * Created by cs.ucu.edu.ua on 06.12.2016.
 */
public class Main {
    public static void main(String[] args){
        TenDispenser tenDispenser = new TenDispenser();
        TwentyDispenser twentyDispenser = new TwentyDispenser();
        FiftyDispenser fiftyDispenser = new FiftyDispenser();
        fiftyDispenser.setNext(twentyDispenser);
        twentyDispenser.setNext(tenDispenser);
        fiftyDispenser.getAmount(new Currency(130));
    }
}
