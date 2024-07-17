package generics;

public class Main {

    public static void main(String[] args) {

        // FOR GENERIC SUBCLASS WITH INHERITANCE
//        Car carObj = new Car();
//        carObj.setVal(2);
//
//        Integer va = carObj.getVal();
//
//        System.out.println(va);

        //bounded example
        Bounded<Integer> exObj = new Bounded<>();
        exObj.setValue(1);

        System.out.println("Bounded example "+ exObj.getValue());

        Pair<String, Integer> obj= new Pair<>();
        obj.put("rohit", 1234);

        System.out.println(obj.getKey()+" "+obj.getValue());
    }

    //generic method

    public <K, V> void printValue(Pair<K,V> pair1, Pair<K,V> pair2){

        if (pair1.getKey().equals(pair2.getKey())){
            // randomly continue;
        }
    }
}
