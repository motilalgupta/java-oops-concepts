package Interface;

import Constructor.Car;

public interface InterfaceTasteStaticMethod {
    void Car();
    void Teacher();

     static void Student(){
         System.out.println("This is static used in common thing like validateCard etc");
     }
default void show(){
    System.out.println("Default method used to add extra information");
}
}
class Test1 implements InterfaceTasteStaticMethod{
    @Override
    public void Car() {
        System.out.println("Car is running");
    }

    @Override
    public void Teacher() {
        System.out.println("Teacher is giving test");
    }
}
class Test{
    public static void main(String[] args) {        // through lambda expression
        //InterfaceTasteStaticMethod t = () -> System.out.println("Car is running");t.Car();

        InterfaceTasteStaticMethod t = new Test1();
        t.Car(); t.Teacher();             // abstract method
        InterfaceTasteStaticMethod.Student(); // static method
        t.show(); // default method
    }
}


