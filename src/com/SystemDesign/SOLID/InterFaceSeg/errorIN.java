package com.SystemDesign.SOLID.InterFaceSeg;

public interface errorIN {
    //interface segamntation
    //interface should be such that client should not implementedunnecessary method fun they dont need

    //here am making interface for waiter
   void washDish();
   void erveCustomer();
   void cookFood();

}
class waiter implements errorIN{
//here am using unneccesary methods
    @Override
    public void washDish() {
        //this work does not belongs to waiter
    }

    @Override
    public void erveCustomer() {
        System.out.println("serves the customer");
    }

    @Override
    public void cookFood() {
    //this work does not belongs to waiter
    }
}
