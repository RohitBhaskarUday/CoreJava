package annotations;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Category {
    String name();
}

@Repeatable(Categories.class) // provide the container so that you can use them multiple annotations
@interface Categori{   // first you will create this
    String name();
}


@Retention(RetentionPolicy.RUNTIME) // this is like an array of container for the storage of the elements.
@interface Categories{ // then you will create this container.
    Categori[] value(); // check how to use it in Bike.java file.
}

// this is created because we will store the extra annotations within this array so that we can repeat the same annotation
// with different inputs.


