package classes;

public class StaticNested {

    int var=10;
    static int varia=100;
    static class InnerClass{
        public void Print() {

            StaticNested OuterClass = new StaticNested();

            System.out.println(OuterClass.var+varia);
        }
    }
}
