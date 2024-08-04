package generics.wildcard;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test {

    public static void main(String[] args) {

        List<Bird> birdList = new ArrayList<>();
        birdList.add(new Eagle());
        birdList.add(new Phoenix());

        List<Eagle> eagleList = new ArrayList<>();
        eagleList.add(new Eagle());
        eagleList.add(new Eagle());


        //birdList=eagleList is not possible

        //Here wild cards help us.
        // Upper bound wild card with <? extends Type>
        Print printObj = new Print();
        printObj.setPrintValues(eagleList);

        //Lowerbound wild card with <? super Type>
        List<Object> objList = new ArrayList<>();
        PrintLowerBound lowerObj = new PrintLowerBound();
        lowerObj.setPrintValues(objList);

        // difference between wild card and generic type is that
        // Wild cards we can give different types of list as parameters
        // In generic type we need to give the same type of list that is mentioned

        //wild cards are more flexible
        // generic types are more restrictive and type safe.


        List<Integer> WildCardsource = new ArrayList<>();
        List<Float> wildCardDestination = new ArrayList<>();

        WIldCardAndGenericType objDiff = new WIldCardAndGenericType();

        // wild card allows different type to pass as a parameter
        // We can pass Number and Float
        objDiff.computeList(WildCardsource, wildCardDestination);
        // generic type allows only same type in the below it should be Integer and Integer
        // we cannot pass Integer and FLoat.
        objDiff.computeList1(WildCardsource, WildCardsource);


        // Type erasure

        // Whatever the code we write, When the bytecode is generated,
        // it will all be replaced by actual value of generic.















    }





}
