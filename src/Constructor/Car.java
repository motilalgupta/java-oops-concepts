package Constructor;

public class Car {
    // fields, attributes, properties
    String name;
    String brand;
    int speed;

    public static void main(String[] args) {
        Car c = new Car();

        c.speed = 100;
        c.run();
    }
    void run(){
        System.out.println("Car is running at : "+speed);
    }
}
