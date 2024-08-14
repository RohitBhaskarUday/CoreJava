package Enum;

public enum EnumInterface {

    MON,
    TUE,
    WED;

    public String toLowerCase(){
        return this.name().toLowerCase();
    }
}
