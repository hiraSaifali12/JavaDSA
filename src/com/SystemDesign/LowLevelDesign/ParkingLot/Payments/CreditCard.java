package com.SystemDesign.LowLevelDesign.ParkingLot.Payments;

public class CreditCard implements  PaymentStrategy {
    private double amount;

    public CreditCard(double amount) {
        this.amount = amount;
    }

    @Override
    public void processPayment() {
        System.out.println("Paid ₹" + amount + " via UPI");
    }
}
