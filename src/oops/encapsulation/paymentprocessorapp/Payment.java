package oops.encapsulation.paymentprocessorapp;

import java.util.ArrayList;
import java.util.List;

public interface Payment{

    void processPayment(double amount);
    void refundPayment(double amount);
    String getTransactionStatus(String transactionId);
    void getPaymentHistory();

}

abstract class OnlinePayment implements Payment{
    private List<String> transactionList = new ArrayList<>();

    void logPayment(String transactionId, double amount){

    }
}



