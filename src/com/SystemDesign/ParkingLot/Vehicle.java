package com.SystemDesign.ParkingLot;

 abstract class Vehicle {
    String licencePlate;
     VehicleType type;
   abstract void getPricingRate();
}
class VehicleFactory{
    public static Vehicle createVehicle(String type){
        if(type.equals("car")){
            return new Car();
        }
        else if(type.equals("bike")){
            return new Bike();
        }
        else if(type.equals("truck")){
            return new Truck();
        }
        throw new IllegalArgumentException();
    }

}
class Car extends Vehicle{
    @Override
    public void getPricingRate(){
        System.out.println("price car");
    }
}
class Truck extends Vehicle{
    @Override
    public void getPricingRate(){
        System.out.println("price truck");
    }
}

class Bike extends Vehicle{
    @Override
    public void getPricingRate(){
        System.out.println("price bike");
    }
}
