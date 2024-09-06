package annotations;

public class Bird implements Eagle {

    @Deprecated // information for the compiler.
    public void fly(){

        System.out.println("Flying");
    }

    @Override
    public void getEagleKind(){
        System.out.println("Eagle class overriden");
    }


}
