package SuperKeyword;

public class Parent {
    String name;
    void details(){
        System.out.println(name.toUpperCase());
    }

}
class Child extends Parent{
    String name;
    void details(){
        super.name="Motilal";
        name="Vishal";
        System.out.println("Parent Name: "+super.name+" and"+" Child Name: "+name);
    }
}
class Test{
    static void main() {
        Child child = new Child();
        child.details();
    }
}