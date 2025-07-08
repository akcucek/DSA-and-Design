package main;

import Service.PaymentService;
import entity.CreditCard;
import entity.DebitCard;
import entity.UPI;

public class PaymentOption {

    public static void main(String[] args) {

        PaymentService ps = new PaymentService();

        ps.addPaymentMethod("Abhishek", new DebitCard("135","Abhishek K"));
        ps.addPaymentMethod("Abhinav", new CreditCard("345", "Ayush"));
        ps.addPaymentMethod("Alankar", new UPI("abhi123"));

        ps.makePayment("Abhishek");
        System.out.println("-----------");
        ps.makePayment("Alankar");
    }
}
