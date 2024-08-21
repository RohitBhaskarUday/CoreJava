package singleton;

public class Synchronized {
    private static Synchronized conObj;

    private Synchronized(){

    }

    synchronized public static Synchronized getInstance(){
        if(conObj == null){
            conObj = new Synchronized();
        }
        return conObj;
    }
}

// so this is created to solve the issue of Lazy Initialization
// the synchronized keyword does 2 things
// 1) it will put a lock on the method
// 2) and unlock the method.
// so when one thread is allowed to enter at a time. Hence only one object is being created.

// Issue with this method : It is very slow and generally not used.

