package com.SystemDesign.LowLevelDesign.ParkingLot.Vehicles;

import com.SystemDesign.LowLevelDesign.ParkingLot.Pricing.PriceStrategy;

public class Bike extends Vehicle{

    public Bike(String vehicleNumber,
               VehicleType vehicleType,
               PriceStrategy priceStrategy) {

        super(vehicleNumber, vehicleType, priceStrategy);
    }
}
