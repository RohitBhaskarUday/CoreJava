package constructor;

public class Math extends Calculation{

    int number;
    int ta;
Math(int number, int ta){
    super(2);
    this.number = number;
    System.out.println("This is the math " + number + " "+ ta);
}
}
