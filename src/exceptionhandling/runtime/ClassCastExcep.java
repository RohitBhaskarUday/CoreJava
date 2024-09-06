package exceptionhandling.runtime;

public class ClassCastExcep {

    public static void main(String[] args) {

        Object val = 0;

        System.out.println((String) val); // class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
                                            //at exceptionhandling.runtime.ClassCastExcep.main

    }

}
