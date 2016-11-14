package order;

/**
 * Created by cs.ucu.edu.ua on 07.11.2016.
 */
public class PayPalPaymentStrategy implements Ipaymant {
    public  String pay(double price){
        return "Payed by PalPay!";

    }
}
