package ChainOfResponsibility;

/**
 * Created by cs.ucu.edu.ua on 06.12.2016.
 */
public class Currency {
    int am;
    public Currency(int am){
        this.am = am;
    }
    public int getMoney(){
        return this.am;
    }
}
