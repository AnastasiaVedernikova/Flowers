package ChainOfResponsibility;

/**
 * Created by cs.ucu.edu.ua on 06.12.2016.
 */
public class FiftyDispenser extends Dispenser {
    Dispenser next;
    @Override
    public Integer getAmount(Currency currency) {
        int am = currency.getMoney();
        this.next.getAmount(new Currency(am%50));
        System.out.println("added 50 dollars "+am/50+" times");
        return am%50;
    }
    @Override
    public void setNext(Dispenser dispenser){
        this.next = dispenser;
        //додає до класу в якому є ланцюг
    }
}
