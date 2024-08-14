package Enum;

public enum EnumAbstract {

   MON{
       public void dummyMethod(){
           System.out.println("MONDAY");
       }
   },
    TUE{
       public void dummyMethod(){
           System.out.println("TUESDAY");
       }
    },
    WED{
       public void dummyMethod(){
           System.out.println("WEDNESDAY");
       }
    },
    THUR{
       public void dummyMethod(){
           System.out.println("THURSDAY");
       }
    };


   public abstract void dummyMethod();

}
