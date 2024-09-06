package misc;

public class VarArgs {

    public static void addNumbers(int... add){

        //this is more clear. than directly assuming add to be the array.
        int[] arr = add;
        int sum= 0;
        for(int i: arr){
            sum+=i;
        }
        System.out.println(sum);
    }

}
