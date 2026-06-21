package com.SystemDesign.LowLevelDesign.ParkingLot.Vehicles;

import com.SystemDesign.LowLevelDesign.ParkingLot.Pricing.PriceStrategy;

public class Truck extends Vehicle{
    public Truck(String vehicleNumber,
                 VehicleType vehicleType,
                 PriceStrategy priceStrategy) {

        super(vehicleNumber, vehicleType, priceStrategy);
    }
}
