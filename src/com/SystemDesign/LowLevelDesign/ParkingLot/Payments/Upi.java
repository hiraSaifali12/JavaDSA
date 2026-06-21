package com.SystemDesign.LowLevelDesign.ParkingLot.Payments;

public class Upi implements  PaymentStrategy{
    private double amount;

    public Upi(double amount) {
        this.amount = amount;
    }

    @Override
    public void processPayment() {
        System.out.println("Paid ₹" + amount + " via UPI");
    }
}
