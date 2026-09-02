package oops.encapsulation.abstraction;

//Bank is Abstract class
abstract class Bank {

    //what is abstract method?
    abstract void withdrawMoney(double amount);

    //what is concrete method?
    public void checkBalance(){
        System.out.println("Checking balance");
    }
}

class ATM extends Bank{

    @Override
    public void withdrawMoney(double amount){
        System.out.println(STR."Withdrawing amount from ATM: \{amount}");

    }
}

class OnlineBanking extends Bank{

    @Override
    public void withdrawMoney(double amount){
        System.out.println(STR."Withdrawing money from OnlineBanking:\{amount}");
    }
}

public class BankAbstractionExample{
    public static void main(String[] args){

        Bank myBank;

        myBank=new ATM();
        myBank.withdrawMoney(200.98);

        myBank=new OnlineBanking();
        myBank.withdrawMoney(399.76);

    }

}