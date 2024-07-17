package classes;

public class Main extends InheritedNestedClass.InnerClass1
{

    public static void main(String[] args) {


        //static

        //no need to create object for static nester inner methid
        // since static means it gets associated with the class we dont have to create an object.
        StaticNested.InnerClass innerClassObj = new StaticNested.InnerClass();

         privateStaticNested objOuter = new privateStaticNested();
         objOuter.display();

         // non static

        // 1) member inner class example
        // create the object of the outerclass first
        NonStaticNested obj3 = new NonStaticNested();
        // use this object to create the object of the inner member
        NonStaticNested.Inner innerObject = obj3.new Inner();
        //now call the member
        innerObject.print();

        //2) Local inner class
        LocalInnerClass obj = new LocalInnerClass();
        obj.display();

        //3) Inner Inheritance
        InheritedNestedClass obj5 = new InheritedNestedClass();
        InheritedNestedClass.InnerClass2 objInnerInheritance = obj5.new InnerClass2();

        objInnerInheritance.display();

        //4) Static inner inheritance
        InheritedNestedClass.InnerClass1 obj10 = new InheritedNestedClass.InnerClass1();

        obj10.innerDisplay();







    }
}
