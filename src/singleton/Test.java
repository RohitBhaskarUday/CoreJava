package singleton;

public class Test {


    Test obj = new Test();



    public static void main(String[] args) {

        Object abc = EagerInitialization.getInstance();

        System.out.println(abc);
    }

}
