package order;

/**
 * Created by cs.ucu.edu.ua on 12.11.2016.
 */
public class RibbonDecorator extends ItemDecorator{
    public RibbonDecorator(Item tm){
        super(tm);

    }
    @Override
    public String getDescription(){
        //System.out.println("added ribbon");
        return this.tm.getDescription()+ "added ribbon; ";
    }
    @Override
    public double price(){
        return 40+ this.tm.price();

    }
}


