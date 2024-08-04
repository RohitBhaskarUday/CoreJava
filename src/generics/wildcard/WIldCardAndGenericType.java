package generics.wildcard;

import java.util.List;

public class WIldCardAndGenericType {

    //wild card
    public void computeList(List<? extends Number> source, List<? extends Number> destination){


    }

    //generictype
    public <T extends Number> void computeList1(List<T> source, List<T> destination){


    }

}
