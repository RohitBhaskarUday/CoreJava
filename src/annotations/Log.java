package annotations;

import java.util.ArrayList;
import java.util.List;

public class Log {

    @SafeVarargs // just use this to supress the heap pollution warning.
    public static void printLogValues(List<Integer>...  logNumbersList){

        // here logNumberList is variable arguments internally java creates an array for it to store items dynamically.
        Object[] objList = logNumbersList;


        List<String> strList = new ArrayList<>();
        strList.add("Hemlow");
        objList[0] = strList; // now this is where you have polluted the VariableArgs
        // since the 0th index has been replaced by string where it should be a list of integers.



    }

}
