package classes;

public class privateStaticNested {
    int outVar = 10;
    static int outStaticVar = 100;
    private static class NestedStatic{

        public void print(){
            System.out.println("Inside of this inner private class "+ outStaticVar);
        }


    }

    public void display(){
        NestedStatic objStaticPrivate = new NestedStatic();
        objStaticPrivate.print();
    }



}
