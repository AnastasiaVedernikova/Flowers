package order;

/**
 * Created by cs.ucu.edu.ua on 07.11.2016.
 */
abstract class Item {
    public String getDescription(){
        return "It is Item: ";
    }
    abstract double price();

}
