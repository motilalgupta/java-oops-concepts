package Inheritance;

public class Animal {
    void eat(){
        System.out.println("Animal is eating...");
    }
    void sound(){
        System.out.println("Making sound treee treee...");
    }
}
class Dog extends Animal{
    @Override
    void sound() {                          // Here we are overriding the sound method
        System.out.println("Bark...");
    }
}
