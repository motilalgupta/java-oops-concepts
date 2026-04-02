package Abstraction;

public class TestATM {
    public static void main(String[] args) {
        ATM atm = new ATM("Vishal",1000000);
        atm.showBalance(); // info
//        atm.balance = 10; // wrong
        atm.showBalance(); // info
    }
}
