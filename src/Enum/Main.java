package Enum;

public class Main {

    public static void main(String[] args) {

//        for (EnumSample i : EnumSample.values()){
//            System.out.println(i.ordinal());
//        }
//
//        EnumSample val = EnumSample.valueOf("MONDAY");
//        System.out.println(val.name());

        for(Example1 examples: Example1.values()){
            System.out.println(examples.ordinal());
        }

        Example1 output =  Example1.valueOf("BETA");
        System.out.println(output.name());

        Example1 enumSet = Example1.BETA;

        enumSet.setValue(2);

        Example1 enumset2= Example1.BETA;


        System.out.println(enumset2.getValue());

        MethodOverride obr = MethodOverride.NIT;
        obr.dummy();
        MethodOverride ob1 = MethodOverride.BEN;
        ob1.dummy();

        EnumAbstract abs = EnumAbstract.MON;
       abs.dummyMethod();


       EnumInterface ifs = EnumInterface.MON;

        System.out.println(ifs.toLowerCase());

        //by using enum instead of static final
        // we get more readability on the code
        // we get more control over what values are needed to be passed.

        // A final class is a kind of class that cannot be inherited
        // there is final keyword used in it.
        // It is certainly not possible to extended and give something like overloading or overriding?




    }


}
