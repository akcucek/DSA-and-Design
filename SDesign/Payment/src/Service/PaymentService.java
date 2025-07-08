package Service;

import entity.PaymentMethod;
import main.PaymentOption;

import java.util.HashMap;

public class PaymentService {
    //Storing + Making Payments
    HashMap<String, PaymentMethod> paymentMethod;

    public PaymentService(){
        paymentMethod = new HashMap<>();
    }
    public void addPaymentMethod(String name, PaymentMethod pm){
         paymentMethod.put(name,pm);
    }

    public void makePayment(String name){
        PaymentMethod pm = paymentMethod.get(name);
        pm.pay(); //Run Time Polymorphism
    }
}
