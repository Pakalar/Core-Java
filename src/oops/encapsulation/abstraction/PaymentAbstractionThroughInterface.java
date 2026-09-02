package oops.encapsulation.abstraction;

interface Payment{

    //Abstract method
    void ProcessPayment(double amount);

}

class PayPalPayment implements Payment{

    @Override
    public void ProcessPayment(double amount) {
        System.out.println(STR."Processing payment of amount:\{amount}");
    }
}

class CreditCard implements Payment{

    @Override
    public void ProcessPayment(double amount) {
        System.out.println(STR."Processing payment through credit card:\{amount}");
    }
}



public class PaymentAbstractionThroughInterface {
    public static void main(String[] args){

        Payment paymentmethod;

        paymentmethod=new PayPalPayment();
        paymentmethod.ProcessPayment(129.676);

        paymentmethod=new CreditCard();
        paymentmethod.ProcessPayment(365.87);

    }
}
