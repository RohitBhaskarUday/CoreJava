package generics.bounded;

public class MultiBound<T extends Vehicle & Car> {
// we should only have one class and other 2 should be interface
    T value;

    public void setBound(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

}
