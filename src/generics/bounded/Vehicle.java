package generics.bounded;

public class Vehicle implements Car{

    Integer value;

    public void setInteger(Integer value){
        this.value = value;
    }

    public Integer getInteger(){
        return value;
    }

    public void displayCar(){
        System.out.println("Inside of the car");
    }
}
