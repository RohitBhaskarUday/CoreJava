package singleton;

public class EagerInitialization {

    private static EagerInitialization conObject = new EagerInitialization();

    private EagerInitialization(){

    }

    public static EagerInitialization getInstance(){
        return conObject;
    }

    // Here we are creating and initializing the object as private static
    // so it gets associated with the class and cannot be accessed outside of the class
    // also created private constructor so that nobody is allowed to create the object using "new" keyword
    // we can return the object if any other class needs the object they can access it using this public static method.

    // issue over here: We are eagerly initializing the object in the beginning itself as soon as the program starts
    // even if it is being used by others or not. ( unnecessary memory ).

}
