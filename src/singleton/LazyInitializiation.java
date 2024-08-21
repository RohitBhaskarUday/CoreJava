package singleton;

public class LazyInitializiation {

    private static LazyInitializiation conObj;

    private LazyInitializiation(){

    }

    public static LazyInitializiation getInstance(){
        if(conObj == null){
            conObj = new LazyInitializiation();
        }
        return conObj;
    }
}

// this is created to solve the problem of eager Initialization where we are creating
// the object as soon as the program starts
// here the object is created if it does not exist.

// Issue over here is that: If two threads tries to access the same object and it is given as null
// then 2 objects will be created.
