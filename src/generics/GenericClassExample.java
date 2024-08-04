package generics;

public class GenericClassExample<T> {

    T value;

    public T getPrintValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }

}
