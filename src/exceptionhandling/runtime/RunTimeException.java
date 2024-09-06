package exceptionhandling.runtime;

public class RunTimeException {

    public static void method1(){
        method2();
    }

    public static void method2(){
        throw new ArithmeticException();
    }

    public static void main(String[] args) {

        RunTimeException.method1();  // Here compiler is not forcing us to handle the exception

    }


}
