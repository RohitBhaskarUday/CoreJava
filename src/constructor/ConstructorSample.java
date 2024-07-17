package constructor;

public class ConstructorSample {


    // even if there is no constructor java internally
        // creates a constructor by default
    ConstructorSample(){
        System.out.println("Inside the no arugument constructor");
    }

    ConstructorSample(int a){
        System.out.println(a+" parameterized constructor");
    }

    public static void main(String[] args) {


        new ConstructorSample(); // use of new keyword to initialize the constructor.
        // no argument constructor example

        new ConstructorSample(21); // parametererized constructor


        // private constructor singleton pattern
    }

}
