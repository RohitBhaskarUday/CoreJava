package classes;

public class Vehicle {
    public static void main(String[] args) {

        Car baleno = new Car() {
            @Override
            public void getValue() {
                int b = 20;
                System.out.println("This is a number "+b);

            }
        };

        baleno.getValue();

    }
}
