package Multilevel;

public class Species {
    void fly(){
        System.out.println("Flying...");
    }
}
class Animal extends Species{
    void eat(){
        System.out.println("Animal is eating...");
    }
    void sound(){
        System.out.println("Making sound treee treee...");
    }

    @Override
    void fly() {
        System.out.println("Not supported...");
    }
}
class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Brak...");
    }
}
