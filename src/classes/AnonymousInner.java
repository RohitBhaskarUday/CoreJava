package classes;

public abstract class AnonymousInner
{

    public abstract void hitBrake();

}

class Test{

    public static void main(String[] args) {

        AnonymousInner obj = new AnonymousInner() {
            @Override
            public void hitBrake() {
                System.out.println("Hitting the brakes");
            }
        };


    }


}
