package order;

import java.util.LinkedList;

/**
 * Created by cs.ucu.edu.ua on 07.11.2016.
 */
public class DHLDelveryStrategy implements Idelivary{
    public String deliver(LinkedList items){
        return "flowers are delivered(DHL)";
    }

}
