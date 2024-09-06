package exceptionhandling;

public class StackTraceExample {


    public void method1(){
//        try {method2();}
//        catch (ArithmeticException e){
//            System.out.println("Division by zero happened");
//        }

        method2();


    }

    public void method2(){
        method3();
    }

    public void method3(){
        int value = 5/0; // division by zero. Is an ArithmeticException.
    }

    public static void main(String[] args) {

        StackTraceExample obj = new StackTraceExample();

        obj.method1();


    }


}
