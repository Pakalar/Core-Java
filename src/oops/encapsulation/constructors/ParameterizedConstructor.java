package oops.encapsulation.constructors;

class BankAccount{

    private int accountNumber;
    private double balance;
    private String accountHolderName;

    //Parameterized Constructor
    public BankAccount(int accnum,double bal,String ahn){
        this.accountNumber=accnum;
        this.balance=bal;
        this.accountHolderName=ahn;
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args){
        BankAccount bacc=new BankAccount(007,45.09, "Mallika");
    }
}
