package generics.wildcard;

import java.util.List;

public class Print {

    public void setPrintValues(List<? extends Bird> birdList){
        for (Bird bird: birdList){
            System.out.println(bird);

        }
    }

}
