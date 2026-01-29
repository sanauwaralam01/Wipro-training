//package com.paymentsystem;
 
import java.util.*;
 
 
abstract class Payment {
    protected double amount;
    public Payment(double amount) {
        this.amount = amount;
    }
    public abstract void processPayment();
}
 
class CCPayment extends Payment {              
    public CCPayment(double amount) {
        super(amount);
    }
 
    @Override
    public void processPayment() {
        System.out.println("Processing Credit Card Payment of Rs." + amount);
    }
}
 
class UpiPayment extends Payment {              
    public UpiPayment(double amount) {
        super(amount);
    }
 
    @Override
    public void processPayment() {
        System.out.println("Processing Upi Payment of Rs." + amount);
    }
}
 
interface PaymentValidator {              
    boolean validate(double amount);
}
 
public class PaymentProcessor {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter payment amount: ");
        double amt = scanner.nextDouble();
        System.out.println("Select Method: 1. Credit Card  2. Upi");
        int choice = scanner.nextInt();
        PaymentValidator validator = amount -> amount > 1000;
        if (validator.validate(amt)) {
            Payment payment;
            if (choice == 1) {
                payment = new CCPayment(amt);
            } else {
                payment = new UpiPayment(amt);
            }
            payment.processPayment();
        } else {
            System.out.println("Invalid Payment Amount!");
            //return;
        }
        /*payment.processPayment();*/
        System.out.println("Payment Successful!");
        
 
        
    }
}
 
