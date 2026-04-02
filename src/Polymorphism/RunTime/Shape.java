package Polymorphism;

public class Shape {
    void shape(){
        System.out.println("Drawing Shape");
    }
}
class Circle extends Shape{
    @Override
    void shape() {
        System.out.println("Drawing Circle");
    }
}
class Rectangle extends Shape{
    @Override
    void shape() {
        System.out.println("Drawing Rectangle");
    }
}

