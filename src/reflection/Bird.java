package reflection;

class Eagle{
    Eagle(){

    }
        public void fly(int name, boolean bool, String str){
            System.out.println("Fly parameter: "+  name+ " bool "+ bool + " strInfo: "+str);
        }
    }

public class Bird {

    private String breed;
    public String canFly;
    public int value;
    int amount;


    public void fly(){
        System.out.println("Flying");
    }

    public void eat(){
        System.out.println("Eating");
    }



}
