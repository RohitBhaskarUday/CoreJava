package singleton;

public class BillPughSolution {

    private BillPughSolution(){

    }

    // inner private static class
    private static class DBHelper{
        private static final BillPughSolution OBJECT = new BillPughSolution();
    }

    // here the eager initialization is resolved
    // by placing the object inside of the inner class which will be loaded only when referred.

    public static BillPughSolution getInstance(){
        return DBHelper.OBJECT;
    }

}
