package exceptionhandling;

class MyCustomException extends Exception{

    MyCustomException(String message){
        super(message);
    }

}

public class CustomException {

    public static void main(String[] args) {
        try{
            method1();
        }
        catch (MyCustomException m){
            m.printStackTrace();
        }
    }

    public static void method1() throws MyCustomException{
        throw new MyCustomException("Hemlow Exception me own"); // need to throw retry

    }

}
