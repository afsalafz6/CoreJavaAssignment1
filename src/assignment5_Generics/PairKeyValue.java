package assignment5_Generics;


import java.io.Serializable;
import java.util.Date;

public class PairKeyValue{
    public static void main(String[] args) {
        Pair<String,String> p1 = new Pair<String,String>();

        p1.setK("02");
        p1.setV("Afsal");

        String Value =p1.getV();
        String Key =p1.getK();
        System.out.println("Print Setted Key and Value, Type String");
        System.out.println("Key : "+ Key +", Value : " + Value + "\n");

        //initialise generic with String and Date
        Pair<String,Date> p2 = new Pair<String,Date>();

        Date d1 =new Date();
        p2.setK("03");
        p2.setV(d1);
        Date Value2 =p2.getV();
        String Key2 =p2.getK();
        System.out.println("Print Setted Key and Value, Type String and Date");
        System.out.println("Key : "+ Key2 +", Value : " + Value2 + "\n");
    }
}
