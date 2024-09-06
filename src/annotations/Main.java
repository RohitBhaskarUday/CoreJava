package annotations;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException{

        System.out.println(new TestClass().getClass().getAnnotation(MyCustomAnnotationWithInherited.class));

        // for repeatable
        // java 8 onwards this was available // the repeatable meta annotation.
        Categori[] catAnnotationArray = new Bike().getClass().getAnnotationsByType(Categori.class);
        for(Categori ann: catAnnotationArray){
            System.out.println(ann.name());
        }

    }

}
