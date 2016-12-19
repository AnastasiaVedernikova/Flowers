package factory;

/**
 * Created by cs.ucu.edu.ua on 19.12.2016.
 */
public enum TypeBucket {
    BirthdayBucket, Funeralbucket, WeedingBucket;
    public String toString(){
        String a;
        if (this.equals(BirthdayBucket)){
            a = "BirthdayBucket";
        }else if (this.equals(Funeralbucket)){
            a = "Funeralbucket";
        }else if (this.equals(WeedingBucket)){
            a = "WeedingBucket";
        }else{
            a = "";
        }
        return a;

    }


    }
