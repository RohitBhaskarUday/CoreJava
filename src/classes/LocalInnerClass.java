package classes;

public class LocalInnerClass {

    int var =19;
    static int Var = 100;

    public void display(){
        int thisMethod = 102;
        class localClassMember{
            int localClass=5;
            public void print(){
                System.out.println("I am with this local class present inside of this method "+ var+ Var+ thisMethod + localClass);
            }
        }

        localClassMember obj = new localClassMember();
        obj.print();


    }
}
