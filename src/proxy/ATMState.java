package proxy;

/**
 * Created by cs.ucu.edu.ua on 19.12.2016.
 */
public interface ATMState {

    void insertCard();

    void ejectCard();

    void insertPin(int pinEntered);

    void requestCash(int cashToWithdraw);

}

