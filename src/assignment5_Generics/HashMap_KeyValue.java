package assignment5_Generics;

import java.util.HashMap;

public class HashMap_KeyValue {
    public static void main(String[] args) {
        HashMap<Integer, Double> hash_map1 = new HashMap<>();

        hash_map1.put(1,10.0);
        hash_map1.put(2,20.0);
        hash_map1.put(3,154.0);
        hash_map1.put(4,568.5);
        hash_map1.put(5,45.9);
        hash_map1.put(6,244.0);
        hash_map1.put(7,123.0);
        hash_map1.put(8,98.0);
        hash_map1.put(9,444.0);
        hash_map1.put(10,5643.44);

        System.out.println("hash_map1 "+hash_map1);

        System.out.println(hash_map1.get(9));

//        HashMap<Integer, Double> hash_map2 =new HashMap<>();
//        hash_map2.putAll(hash_map1);
//        System.out.println(hash_map2);

    }
}
