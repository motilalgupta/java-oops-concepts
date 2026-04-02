package Polymorphism;

public class CalTest {
    public static void main(String[] args) {
        Calculator cal=new Calculator();    //JVM has not any confusion bcoz LHS & RHS is same so it's Compile time Polymorphism
        int res = cal.add(10,10,10);
        System.out.println(res);
    }
}
