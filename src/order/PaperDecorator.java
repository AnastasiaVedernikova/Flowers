package order;

/**
 * Created by cs.ucu.edu.ua on 12.11.2016.
 */
public class PaperDecorator extends ItemDecorator {
    //Item item;
    public PaperDecorator(Item tm){
        super(tm);

    }
    @Override
    public String getDescription(){
       // System.out.println("added paper");
        return this.tm.getDescription()+"added paper; ";
    }
    @Override
    public double price(){
        return 13+this.tm.price();

    }
}
