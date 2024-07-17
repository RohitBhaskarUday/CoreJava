package methods;

public class Methods extends AbstractExample {

    // implementing the abstract method
    public void printAbstract(){
        System.out.println("this is the abstract method implementation");
    }


    int value = 10; //instance variable
    static int val = 1000;
    public static final void print(){
        System.out.println("This is a static method and" +
                " I just called it using " +
                "Class name to call this method. ");

        Methods inside = new Methods();

        System.out.println("instance can be accessed via object creation of the class " + inside.value);

        System.out.println("the instance variable cannot be accessed. " + val);


    }




}
