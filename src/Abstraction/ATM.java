package Abstraction;

public class ATM{
    private String accountHolderName;       // putting private is known as abstraction
    private double balance;

    ATM(String name, double balance){
        this.accountHolderName = name;
        this.balance = balance;
    }

    public static void main(String[] args) {
        ATM atm = new ATM("Motilal",10000);
        atm.showBalance();
    }
    public void showBalance(){
        System.out.println("Your current balance is : "+balance);
    }
}
