package singleton;

public class DoubleCheckedLocking {

    private static volatile DoubleCheckedLocking conObject;

    private DoubleCheckedLocking(){

    }

    public static DoubleCheckedLocking getInstance(){

        if(conObject==null){
            synchronized (DoubleCheckedLocking.class){
                if(conObject==null){
                    conObject = new DoubleCheckedLocking();
                }
            }
        }

        return conObject;
    }

}

// Synchronized is not on method but on the block, Because of synchronized on the block they lock only once.

// Issue with this is on the memory.

/*
Each core has a dedicated Cache L1 present in it where they store objects temporarily

Now when Thread-1 computation is happening at Core-1 and it enters the method to get object.
as it is null for the first time the object will be created and stored temporarily inside of the cache.
Now at this point Thread-2 computation starts at COre-2 and it enters the method and check whether the object has been
created or not. and since the cache from core-1 did not sync with the memory when the thread2 checks the value is null
and creates another object. Now 2 objects are created.

So, to avoid it we use the keyword volatile which will directly write it on the memory.

read-write operation happening to this will always happen in memory.


 */

// volatile keyword would directly write over the memory instead of cache.


