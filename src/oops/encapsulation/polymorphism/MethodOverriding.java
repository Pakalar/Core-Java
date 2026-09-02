package oops.encapsulation.polymorphism;

class Payment{
    public void ProcessPayment(double amount){
        System.out.println(STR."Processing the payment of::\{amount}");
    }
}
class CreditCard extends Payment{
    @Override
    public void ProcessPayment(double amount){
        System.out.println(STR."Processing payment of \{amount}through credit card");
    }
}
class Paypal extends Payment{
    @Override
    public void ProcessPayment(double amount){
        System.out.println(STR."Processing payment of \{amount} through Paypal ");
    }
}
public class MethodOverriding {
    public static void main(String[] args){
        Payment payment;
        payment=new CreditCard();
        payment.ProcessPayment(10);

        payment=new Paypal();
        payment.ProcessPayment(12.98);
    }
}
