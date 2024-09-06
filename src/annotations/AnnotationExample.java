package annotations;


public class AnnotationExample {

    @SuppressWarnings("all")
    public static void main(String[] args) {


        //Used over Java Code
        //1) Deprecated - Can be used to avoid unwanted code which is not under use.
        //2) Override - Written over the overriden code even this is optional anyhow overriding happens
        //3) SuppressWarnings - can be used to suppress warnings coming up over a certain method, constructor etc.
        //4) FunctionalInterface - used to restrict an interface to only have one abstract method.
        //5) Safevarargs

        //Meta Annotation - Annotation used over annotation is called Meta Annotation.
        //1) Target - to ensure which of the above annotations to be used correctly on different scenarios
        //2) Retention - To store within the java-code and there are 3 RetentionPolicy = SOURCE, CLASS, RUNTIME.
        //3) Documented - Used to generate annotations when a java document is created. Else java by default will ignore all the Annotations.
        //4) Inherited - Basically inheritance for annotations of parent class on to the child class.
        //5) Repeatable - Create a container for this (implicitly an array will be created),

        Bird obj = new Bird();

        obj.fly();

        obj.getEagleKind();

        Mobile mobileObj = new Mobile();

        mobileObj.dumbMethod();



    }



}
