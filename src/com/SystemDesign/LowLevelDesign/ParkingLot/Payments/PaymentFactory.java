package com.SystemDesign.LowLevelDesign.ParkingLot.Payments;

public class PaymentFactory {
    public static PaymentStrategy getPaymentStrategy(int paymentMethod, double fee) {

        switch (paymentMethod) {

            case 1:
                return new Upi(fee);

            case 2:
                return new CreditCard(fee);

            default:
                throw new IllegalArgumentException("Invalid payment method");
        }
    }
}
