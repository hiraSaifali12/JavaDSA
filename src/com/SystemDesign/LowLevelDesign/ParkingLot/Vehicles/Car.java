package com.SystemDesign.LowLevelDesign.ParkingLot.Vehicles;

import com.SystemDesign.LowLevelDesign.ParkingLot.Pricing.PriceStrategy;

public class Car extends Vehicle{
    public Car(String vehicleNumber,
               VehicleType vehicleType,
               PriceStrategy priceStrategy) {

        super(vehicleNumber, vehicleType, priceStrategy);
    }
}
