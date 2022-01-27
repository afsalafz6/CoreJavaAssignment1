package assignment5_Generics;


import java.util.Date;

class Pair<K,V> {
    private K k;
    private V v;

    public Pair(V key, V value) {
        System.out.println("Key : "+ key +", Value : " + value);
    }

    public void setKey(K k) {
        this.k = k;
        this.v = v;
    }
    public void setValue(V v) {
        this.v = v;
    }
    public V get() {
        return v;
    }

}

public class PairKeyValue{
    public static void main(String[] args) {
        Pair<String,String> p1 = new Pair<String,String>("01", "Raj");
//        Date date = new Date();
//        Pair<String, Date> p2 = new Pair<String,String>("01",date);

//        p1.setKey("02");
//        p1.setValue("Afsal");
//        p1.get();
        System.out.println(p1.get());

    }
}
