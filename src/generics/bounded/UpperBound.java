package generics.bounded;

public class UpperBound<T extends Number> {

    public UpperBound(T value){
        this.value=value;
    }


    T value;

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value= value;
    }



}
