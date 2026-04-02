package Polymorphism;

import javax.security.sasl.RealmChoiceCallback;

public class TestShape {
    public static void main(String[] args) {
//        Shape shape = new Shape();
//        shape.shape();
//
//        Circle circle = new Circle();
//        circle.shape();
//
//        Rectangle rectangle = new Rectangle();
//        rectangle.shape();

        Shape shape = new Circle();
        shape.shape();
        Shape shape1 = new Rectangle();
        shape1.shape();
    }
}

