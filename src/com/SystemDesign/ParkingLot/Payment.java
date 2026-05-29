package com.SystemDesign.ParkingLot;

public interface Payment {
void pay();
}
class Upi implements Payment{
    @Override
    public void pay(){
        System.out.println("Upi class");
    }
}
class CreditCard implements Payment{
    @Override
    public void pay(){
        System.out.println("CreditCard class");
    }
}
class PaymentStrategy{
    private Payment payment;
    public  PaymentStrategy(Payment payment){
        this.payment= payment;
    }
    public void checkout(){
        payment.pay();
    }
}
class PaymentFactory{
    public static Payment createobject(String type){
        if(type.equals("Upi")){
            return new Upi();
        }else if(type.equals("Credit Card")){
            return new CreditCard();
        }
        throw new IllegalArgumentException();
    }
}