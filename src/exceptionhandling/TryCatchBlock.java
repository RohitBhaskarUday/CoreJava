package exceptionhandling;

import exceptionhandling.compiletime.ClassNotFound;

import java.io.FileNotFoundException;

public class TryCatchBlock {

    public static void method1(String name) throws ClassNotFoundException, InterruptedException, FileNotFoundException{

        if(name.equals("dummy")){
            throw new ClassNotFoundException();
        }else if(name.equals("interupted")){
            throw new InterruptedException();
        }

    }

    public static void main(String[] args) {

//        try{
//            TryCatchBlock.method1("dummy");
//        }catch (ClassNotFoundException c){
//            System.out.println("caught exception Class not found");
//        }catch (InterruptedException i){ // first provide the specific exception then go for the below parent exception
//            System.out.println("Class not found exception");
//        }catch (Exception f){ // parent exception so everything will throw exception
//            System.out.println("exception parent class");
//        }


        try{
            TryCatchBlock.method1("dummy");
        }catch (ClassNotFoundException | InterruptedException e){
            System.out.println("It was either Class not found or Interupted Exception");
        }
        catch (Exception e){
            System.out.println("Parent Exception");
        }


    }

}
