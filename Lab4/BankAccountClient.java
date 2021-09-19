package Lab4;

//Lab4 9am
//Daniel Rochefort

public class BankAccountClient {
    public static void main(String[] args){

        //BankAccount initializing name and balance at the time of instantiating the object using the constructor
        BankAccount B1 = new BankAccount("Jake",200.00);
        B1.deposit(500);
        System.out.println(B1);
        B1.withdraw(300);
        System.out.println(B1);

        //used to add extra space between BankAccounts
        System.out.println();

        //BankAccount not initializing name and balance at the time of instantiating the object using the constructor
        //as this BankAccount constructor does not have any arguments
        BankAccount B2 = new BankAccount();
        System.out.println(B2);
        B2.setFields("John",20.00);
        System.out.println(B2);

    }
}
