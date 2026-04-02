package Interface;

public interface Animal {
    void sound();
    void eat();
}
class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("bark");
    }

    @Override
    public void eat() {
        System.out.println("milk-roti");
    }
}
class Driver{
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound(); a.eat();
    }
}
