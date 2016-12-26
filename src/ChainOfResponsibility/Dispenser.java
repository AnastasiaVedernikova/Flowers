package ChainOfResponsibility;

/**
 * Created by cs.ucu.edu.ua on 06.12.2016.
 */
abstract class Dispenser {
    Dispenser next;
    abstract public Integer getAmount(Currency currency);
    abstract public void setNext(Dispenser dispenser);
}
