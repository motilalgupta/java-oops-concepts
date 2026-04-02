package Multilevel;

public class TestMultilevelInheritance {
    public static void main(String[] args) {
        Species species = new Species();
        species.fly();

        Animal animal = new Animal();
        animal.sound();
        animal.eat();
        animal.fly();

        Dog dog = new Dog();
        dog.sound();
        dog.fly();
    }
}
