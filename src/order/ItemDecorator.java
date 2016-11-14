package order;

/**
 * Created by cs.ucu.edu.ua on 07.11.2016.
 */
abstract public class ItemDecorator extends  Item{
        Item tm;
        public ItemDecorator(Item tm){
            this.tm = tm;
        }

        public abstract String getDescription();

}
