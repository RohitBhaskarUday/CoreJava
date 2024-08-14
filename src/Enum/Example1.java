package Enum;

public enum Example1 {

    PI,
    ALPHA,
    BETA(1),
    GAMMA,
    DELTA;

    private int val;
    Example1(int val){
        this.val = val;
    }

    public int getValue(){
        return val;
    }

    public void setValue(int val){
        this.val = val;
    }

    Example1(){}
}
