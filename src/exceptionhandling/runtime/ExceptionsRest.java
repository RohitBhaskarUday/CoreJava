package exceptionhandling.runtime;

public class ExceptionsRest {

    public static void main(String[] args) {
        int[] val = new int[2];
        String n = "hello";
        //System.out.println(val[3]); // IndexOutOfBoundException
        //System.out.println(n.charAt(6)); // StringIndexOutOfRange

        System.out.println(Integer.parseInt("hello")); //IllegalArgumentException

    }




}
