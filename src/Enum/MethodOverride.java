package Enum;

public enum MethodOverride {

    NIT{

        public void dummy(){
            System.out.println("Inside of NIT's Dummy method");
        }
    },
    YEN,
    BEN,
    WON;

    public void dummy(){
        System.out.println("This is a dummy method");
    }
}
