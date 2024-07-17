package classes;

public class InheritedNestedClass {

    int var =10;
    static class InnerClass1{
        int area =100;
        public void innerDisplay(){
            System.out.println("Static nested inner class");
        }
    }
    class InnerClass2 extends InnerClass1{
        int height = 200;
        public void display(){
            System.out.println(" This is an extended class and we can acess the parent value "+
                    area +" and the child value "+ height);
        }

    }




}
