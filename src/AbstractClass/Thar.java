package AbstractClass;

public class Thar extends Vehicle{

    Thar(String brand){
        super(brand);   // parent class constructor
    }
    @Override
    public void start() {
        this.run();
        System.out.println("Thar gets started...");
        System.out.println("The brand is: "+brand);
    }
}
class Driver{
    public static void main(String[] args) {
        Vehicle v = new Thar("Mahindra");
        v.start();
    }
}
