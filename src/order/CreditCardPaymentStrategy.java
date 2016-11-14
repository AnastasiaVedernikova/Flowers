package order;

import java.util.Scanner;

/**
 * Created by cs.ucu.edu.ua on 07.11.2016.
 */
public class CreditCardPaymentStrategy implements Ipaymant {
    //Scanner sc = new Scanner(System.in);
    private boolean isValid(String creditCard) {
        return true;
    }
    public String pay(double price){

        Scanner sc = new Scanner(System.in);
        String creditCard = sc.next();

//        System.out.println("Enter number of credit card");
//        String s = sc.nextLine();
        if (isValid(creditCard)) {
            return "Payed by credit card!"+price;
        }else{
            return "Not paid by credit card"+price;
        }
    }
}
