package generics;

public class GenericPair<K,V> {

    K key;
    V value;

    public void put(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }

}
