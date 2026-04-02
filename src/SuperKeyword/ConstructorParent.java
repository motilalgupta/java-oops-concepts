package SuperKeyword;

public class ConstructorParent {
//    ConstructorParent(){
//        System.out.println("I am parent Constructor");
//    }
    ConstructorParent(int x){
        System.out.println("I have "+x+" rupees");
    }
}
class ConstructorChild extends ConstructorParent{
//    ConstructorChild(){
//        super();  // If we don't mention super(), it is automatically called by JVM in case of default Constructor.
//        System.out.println("I am child Constructor");
//    }
    ConstructorChild(int y){
        super(100);         // we must add super keyword at the first line of constructor, it is not automatically
        // called by JVM, in case of parameterized constructor...
        System.out.println("I have "+y+" rupees");
    }
}
class ConstructorTest{
    public static void main(String[] args) {
        ConstructorChild cchild = new ConstructorChild(10);
    }
}