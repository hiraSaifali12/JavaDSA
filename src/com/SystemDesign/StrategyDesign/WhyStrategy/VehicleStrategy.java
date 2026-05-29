package com.SystemDesign.StrategyDesign.WhyStrategy;

interface StrategyDrive{
    public void drive();
}
class SportDrive implements StrategyDrive {

    @Override
    public void drive() {
        System.out.println("Sport drive mode");
    }
}
class LuxryDrive implements StrategyDrive {

    @Override
    public void drive() {
        System.out.println("Luxry drive mode");
    }
}
class NormalDrive implements StrategyDrive {

    @Override
    public void drive() {
        System.out.println("Normal drive mode");
    }
}
public class Vehicle {
    StrategyDrive strategyDrive;
    public Vehicle(StrategyDrive strategyDrive){
        this.strategyDrive=strategyDrive;
    }
    public void drive(){
        strategyDrive.drive();
    }

}
class SportVehicle extends Vehicle{
    SportVehicle() {
        super(new SportDrive);
    }
}
class LuxryVehicle extends Vehicle{

}
class PublicVehicle extends Vehicle{

}