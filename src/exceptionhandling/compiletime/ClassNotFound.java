package exceptionhandling.compiletime;

public class ClassNotFound {

    public static void method1() throws ClassNotFoundException{
        method2();


    }

    public static void method2() throws ClassNotFoundException { // throws can be used only after a method
        throw new ClassNotFoundException();
    }

    public static void main(String[] args) throws ClassNotFoundException {
        try{
            throw new ClassNotFoundException();
        }catch (ClassNotFoundException e){
            System.out.println("Caught exception");
        }

    }

}
