package Lab4;

//Lab4 9am
//Daniel Rochefort

public class BankAccount {
    private String name;
    private double balance;

    //BankAccount with constructors to initialize the object using the constructor
    public BankAccount(String pName, double pBalance){
        this.name = pName;
        this.balance = pBalance;
    }

    //BankAccount without constructors to initialize the object without using the constructor
    //because it would not run if I did not add this BankAccount without the constructors
    public BankAccount(){
    }

    public void setFields(String pName, double pBalance){
        this.name = pName;
        this.balance = pBalance;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        balance = balance - amount;
    }

    @Override
    public String toString(){
        return getName() + ", $" + String.format("%.2f", getBalance());
    }
}
