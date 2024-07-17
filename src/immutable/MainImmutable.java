package immutable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainImmutable {


    public static void main(String[] args) {

        List<Object> names = new ArrayList<>();

        names.add("Rob");
        names.add("ert");

        ImmutableClass objImmutable = new ImmutableClass("Rohit", names);
        // Once this is created we cannot change it to any further name.

        objImmutable.getNames().add("Mahesh");


        System.out.println(objImmutable.getName());
        System.out.println(objImmutable.getNames());


    }
}
