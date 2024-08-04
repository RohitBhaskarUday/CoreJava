package generics;

import java.util.Arrays;

public class MainGenerics {
    public static void main(String[] args) {

        Purpose purposeObj = new Purpose();
        purposeObj.setPrintValue(3);

        Object printValue = purposeObj.getPrintValue();

        // if(printValue==3) this is not possible since the value passed is an object
        // we have to type caste it and then compare then only the condition works
        if((int)printValue==3){
            System.out.println("Hey this is difficult use a generic instead.");
        }



    }
}
