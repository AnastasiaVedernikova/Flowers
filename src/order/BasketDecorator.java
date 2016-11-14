package order;

/**
 * Created by cs.ucu.edu.ua on 12.11.2016.
 */
public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Item tm){
        super(tm);

    }
    @Override
    public String getDescription(){
        return this.tm.getDescription()+"added basket; ";
    }
    @Override
    public double price(){
        return 4+this.tm.price();

    }
}
