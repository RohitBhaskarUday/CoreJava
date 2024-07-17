package memorymanagement;

import java.lang.ref.WeakReference;

public class GarbageCollection {

    public static void main(String[] args) {

        // create a strong reference
        String pObject = new String("Roshan");

        //create a weak reference to the above object using this library.
        WeakReference<String> weakReference = new WeakReference<>(pObject);

        //check the object values if it is present of not through weak Reference
        System.out.println("Strong Reference "+pObject);
        System.out.println("Weak Reference "+weakReference.get());

        // now nullify the reference and dont point it to Roshan string pool
        pObject = null;

        // remember we have not done anything to the weak reference yet.
        // it is still pointing perhaps weakly to the String Object

        // call the GC
        System.gc();

        //System.out.println("Strong Reference after GC "+ pObject);
        System.out.println("Weak Reference after GC " + weakReference.get());



    }

}
