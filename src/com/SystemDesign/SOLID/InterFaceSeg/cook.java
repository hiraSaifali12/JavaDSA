package com.SystemDesign.SOLID.InterFaceSeg;

public interface cook {
    void cookFood();
    void decideMenu();
}
class cookImp implements cook{

    @Override
    public void cookFood() {
        System.out.println("cook cooked food");
    }

    @Override
    public void decideMenu() {
        System.out.println("decide the menu");

    }
}
