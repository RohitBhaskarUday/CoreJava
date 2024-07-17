package constructor;

public class Calculation {
    int a;
    Calculation(int a){
        this.a =a;
        System.out.println("This is the parent constructor");
    }



    public static void main(String[] args) {

        new Calculation(12);
    }

}
