package generics;

public class Generics<T> {

    T value;

    public T getValue(){
        return value;
    }

    public void setPrintValue(T value){
        this.value = value; // here this.value is refering to the instance variable and value assigned is the parameter value
    }

}
