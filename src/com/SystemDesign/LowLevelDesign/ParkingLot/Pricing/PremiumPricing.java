package com.SystemDesign.LowLevelDesign.ParkingLot.Pricing;

import com.SystemDesign.LowLevelDesign.ParkingLot.Vehicles.VehicleType;

public class PremiumPricing implements  PriceStrategy {
    public double calculateFees(VehicleType vehicleType, PricingType pricingType, int duration){
        switch(vehicleType){
            case CAR:
                return pricingType==PricingType.HOURLY? duration*8 : duration*10*24;
            case TRUCK:
                return pricingType==PricingType.HOURLY? duration*17 : duration*10*24;
            case BIKE:
                return pricingType==PricingType.HOURLY? duration*4 : duration*10*24;
            default :
                throw new IllegalArgumentException("Not allowed");
        }
    }
}
