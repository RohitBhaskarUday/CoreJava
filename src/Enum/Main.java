package Enum;

public class Main {

    public static void main(String[] args) {

        for (EnumSample i : EnumSample.values()){
            System.out.println(i.ordinal());
        }

        EnumSample val = EnumSample.valueOf("MONDAY");
        System.out.println(val.name());

    }
}
