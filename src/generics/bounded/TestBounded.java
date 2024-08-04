package generics.bounded;

public class TestBounded {


    public static void main(String[] args) {



        MultiBound<Vehicle> objMult = new MultiBound<>();

        Vehicle car = new Vehicle();

        car.setInteger(19);
        objMult.setBound(car);

        Vehicle value = objMult.getValue();

        System.out.println("Integer value "+ value.getInteger());
        value.displayCar();








    }

}
