package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class Mai {


    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {

        // first reflect the object of the class.
        // there are three different ways to do that.

        //1) using .forName("Name_of_the_class")
       // Class birdClass = Class.forName("Bird");

        //2) using .class
        Class birdClass1 = Bird.class;

        //3) using getClass() method
        Bird birdObj = new Bird();
        Class birdClass3 = birdObj.getClass();

        Method[] methods1 = birdClass1.getMethods();
        Method[] methods = birdClass1.getDeclaredMethods();

        for(Method m : methods){
            System.out.println(m);
        }

        // section 2

        Class eagleClass=  Eagle.class;
        Object eagleObj = eagleClass.newInstance();


        Method flyMethod  = eagleClass.getMethod("fly", int.class, boolean.class, String.class);
        flyMethod.invoke(eagleObj, 1, false, "hemlow");

        // reflection on fields.
        Field[] fields = birdClass1.getFields();
        for(Field f: fields){
            System.out.println(f); // only the public members are printed outside.
        }

        // setting the value for public field
        Class birdClass_1 = Bird.class;

        Field field = birdClass_1.getDeclaredField("canFly");
        field.set(birdClass_1, "Cantfly");
        //System.out.println(birdClass_1.canFly);


        // for private values set the field to field.setAccessible();











    }
}
