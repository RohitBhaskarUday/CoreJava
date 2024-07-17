package memorymanagement;

public class StackMemory {

    public static void main(String[] args) {

        int primitiveVar = 20;
        GarbageCollection garbObject = new GarbageCollection();
        String str = "200";
        StackMemory stackObject = new StackMemory();
        stackObject.memoryTest(garbObject);

    }

    private void memoryTest(GarbageCollection garbageCollection){
        GarbageCollection garb = garbageCollection;
        String str2="200";
        String str3 = new String("200");
    }

    // once we reach this closing parantheses the stack will get empty.
    //the main() method goes in the stack first
    // all the primitives and objectreferences are stored in the stack
    // the objects are stored inside of the heap memory
    // the string literals as well are createdin the heap memory
    // then the memory test would be added on top of the scope of the main() method.
    // once it hits the closing parenthisis then the scope ends it will be deleted in lifo order
    // similarly the main method and hence the stack would be cleared
    // but the heap objects and literals stay the same
    // the garbage collector would delete all the un-referenced data present in the heap.
}
