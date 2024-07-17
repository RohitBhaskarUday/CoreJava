package classes;

public class NonStaticNested {

    int var=10;
    static int car = 100;
    public class Inner{
        public void print(){ // member of the inner class
            System.out.println("INside of this non static inner class "+ var +" " + car);
        }
    }
}
