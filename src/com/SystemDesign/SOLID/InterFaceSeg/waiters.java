package com.SystemDesign.SOLID.InterFaceSeg;

public interface waiters {

    void serveCust();
    void takeOrder();
}
class waitersImp implements waiters{

    @Override
    public void serveCust() {
        System.out.println("surve food to customer");
    }

    @Override
    public void takeOrder() {
        System.out.println("take order");
    }
}