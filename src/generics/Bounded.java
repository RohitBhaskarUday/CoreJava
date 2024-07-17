package generics;

public class Bounded <T extends Number> {

    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value){
        this.value=value;
    }
}

