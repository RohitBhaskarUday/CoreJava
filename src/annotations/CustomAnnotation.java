package annotations;


@CustAnnotation // the default value would be generated. you do not need to explicitly add values.
public class CustomAnnotation {
    public void getHelp(){
        System.out.println("Helped in creating this custom annotation.");
    }
}
