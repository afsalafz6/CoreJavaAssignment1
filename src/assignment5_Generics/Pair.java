package assignment5_Generics;

public class Pair<K,V> {
        private K k;
        private V v;

//        public Pair(V key, V value) {
//            System.out.println("Key : "+ key +", Value : " + value);
//        }


    public void setK(K k) {
        this.k = k;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public V getV() {
        return v;
    }

}
