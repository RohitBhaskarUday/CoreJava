package constructor;

public class Employee extends Manager{

    int a;
    int b;
    Employee(int a, int b){
        super(1,2);
        this.a = a;
        this.b=b;
        System.out.println("Inside Employee "+ a+" "+b);
    }

}
