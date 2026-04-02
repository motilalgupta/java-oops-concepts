package AbstractClass;

public abstract class Vehicle{
    static String brand;
    Vehicle(String brand){
        this.brand = brand;
    }
    public abstract void start();               // abstract method

    public void run(){
        System.out.println("Car is running");    // concrete method
    }
}
