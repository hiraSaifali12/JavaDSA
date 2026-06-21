package com.SystemDesign.LowLevelDesign.ParkingLot.Pricing;

import com.SystemDesign.LowLevelDesign.ParkingLot.Vehicles.VehicleType;

public interface PriceStrategy {
    double calculateFees(VehicleType vehicleType, PricingType pricingType,int duration);
}
