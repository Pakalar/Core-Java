package oops.encapsulation.staticandfinalexample;

class BankAccount{

    //Instance variables
    //Object level variables
   private String accountHolderName;
   private double balance;

    //static variable for common interestrate
    //Class level variable
   private static double InterestRate=3.5;

   //Parameterized constructor
   public BankAccount(String accountHolderName,double balance){
       this.accountHolderName = accountHolderName;
       this.balance = balance;
   }

   //static method to set interest rate
    //static methods can only access static variables
   public static void setInterestRate(double interestRate) {
       InterestRate = interestRate;
   }

   //Instance method to display account details
    public void displayAccount(){
       System.out.println(STR."Account Holder Name:\{accountHolderName}Balance::\{balance}Interest ate is::\{InterestRate}");
    }
}

public class StaticVariables {
    public static void main(String[] args){
        BankAccount account1=new BankAccount("Test",1000);
        account1.displayAccount();
        BankAccount.setInterestRate(8.5);
        account1.displayAccount();
    }
}
