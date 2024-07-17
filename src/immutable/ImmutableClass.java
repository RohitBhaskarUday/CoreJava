package immutable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

final class ImmutableClass {

    private String name;
    private List<Object> names;

    ImmutableClass(String name, List<Object> names){
        this.name = name;
        this.names = names;
    }

    public String getName(){
        return name;
    }

    public List<Object> getNames(){
        return new ArrayList<>(names);
    }



}
