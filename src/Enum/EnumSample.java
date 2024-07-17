package Enum;

public enum EnumSample {
    MONDAY(101, "1st day"),
    TUESDAY(102,"2nd day"),
    WED(103, "3rd day"),
    THURS(104, "4th day");

    private int val;
    private String comment;

    EnumSample(int val, String comment){
        this.val = val;
        this.comment = comment;
    }

    public static EnumSample EnumMethod(int value){
        for(EnumSample i: EnumSample.values()){
            if(i.val == value){
                return i;
            }
        }
        return null;

    }


}

