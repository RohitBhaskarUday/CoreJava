package generics;

import generics.bounded.UpperBound;

public class Test {

    public static void main(String[] args) {

        GenericClassExample<String> genericObj = new GenericClassExample<>();

        genericObj.setValue("Hello");

        //System.out.println(" THis is the obj " + genericObj.getPrintValue());
        String ans = genericObj.getPrintValue();

        System.out.println("This is the String answer: "+ans);

        // creating the obj of example
        Example exObj = new Example();

        exObj.setValue("This is the inherited class");


        GenericPair<Integer, String > empObj = new GenericPair<>();

        empObj.put(101, "Rohit");

        System.out.println(empObj.getKey()+ " and the name is " + empObj.getValue());

        //Raw Object Type
        GenericClassExample obj10 = new GenericClassExample();
        obj10.setValue(10);
        //obj10.setValue("Rohit");

        System.out.println(obj10.getPrintValue());

        // Upperbound exanmple
        UpperBound<Integer> objUpper  = new UpperBound<>(2);


        System.out.println(objUpper.getValue());



    }
}
