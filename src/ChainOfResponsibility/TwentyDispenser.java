package ChainOfResponsibility;

/**
 * Created by cs.ucu.edu.ua on 06.12.2016.
 */
public class TwentyDispenser extends Dispenser {
    Dispenser next;
    @Override
    public Integer getAmount(Currency currency) {
        int am = currency.getMoney();
        this.next.getAmount(new Currency(am%20));
        System.out.println("added 20 dollars "+am/20+" times");
        return am%20;
    }
    @Override
    public void setNext(Dispenser dispenser){
        this.next = dispenser;
        //додає до класу в якому є ланцюг
    }
}
