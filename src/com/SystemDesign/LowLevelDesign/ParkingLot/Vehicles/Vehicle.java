package com.SystemDesign.LowLevelDesign.ParkingLot.Vehicles;

import com.SystemDesign.LowLevelDesign.ParkingLot.Pricing.PriceStrategy;
import com.SystemDesign.LowLevelDesign.ParkingLot.Pricing.PricingType;

public abstract class Vehicle {
    private String vehicleNumber;
    private VehicleType vehicleType;
   private PriceStrategy price;
    public Vehicle(String vehicleNumber,VehicleType vehicleType,PriceStrategy price){
        this.vehicleNumber=vehicleNumber;
        this.vehicleType=vehicleType;
        this.price=price;
    }
    public String getVehicleNumber(){
        return vehicleNumber;
    }
    public VehicleType getVehicleType(){
        return vehicleType;
    }

    public double calculateFee(int duration, PricingType pricingType) {
        return price.calculateFees(vehicleType, pricingType, duration);
    }
}
