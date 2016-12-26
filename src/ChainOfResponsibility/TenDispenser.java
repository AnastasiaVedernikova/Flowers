package ChainOfResponsibility;

/**
 * Created by cs.ucu.edu.ua on 06.12.2016.
 */
public class TenDispenser extends Dispenser {
    Dispenser next;
    @Override
    public Integer getAmount(Currency currency) {
        int am = currency.getMoney();
       // this.next.getAmount(new Currency(am%10));
        System.out.println("added 10 dollars "+am/10+" times");

        return am%10;
    }
    @Override
    public void setNext(Dispenser dispenser){
        this.next = dispenser;
        //додає до класу в якому є ланцюг
    }
}
