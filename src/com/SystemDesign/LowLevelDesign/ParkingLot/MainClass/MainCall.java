package com.SystemDesign.LowLevelDesign.ParkingLot.MainClass;

import com.SystemDesign.LowLevelDesign.ParkingLot.Payments.CreditCard;
import com.SystemDesign.LowLevelDesign.ParkingLot.Payments.PaymentFactory;
import com.SystemDesign.LowLevelDesign.ParkingLot.Payments.PaymentStrategy;
import com.SystemDesign.LowLevelDesign.ParkingLot.Payments.Upi;
import com.SystemDesign.LowLevelDesign.ParkingLot.Pricing.BasicPricing;
import com.SystemDesign.LowLevelDesign.ParkingLot.Pricing.PremiumPricing;
import com.SystemDesign.LowLevelDesign.ParkingLot.Pricing.PriceStrategy;
import com.SystemDesign.LowLevelDesign.ParkingLot.Pricing.PricingType;
import com.SystemDesign.LowLevelDesign.ParkingLot.SPOT.BikeParkingSpot;
import com.SystemDesign.LowLevelDesign.ParkingLot.SPOT.CarParkingSpot;
import com.SystemDesign.LowLevelDesign.ParkingLot.SPOT.ParkingSpot;
import com.SystemDesign.LowLevelDesign.ParkingLot.Vehicles.Bike;
import com.SystemDesign.LowLevelDesign.ParkingLot.Vehicles.Car;
import com.SystemDesign.LowLevelDesign.ParkingLot.Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.SystemDesign.LowLevelDesign.ParkingLot.Vehicles.VehicleType.BIKE;
import static com.SystemDesign.LowLevelDesign.ParkingLot.Vehicles.VehicleType.CAR;

public class MainCall {
    public static void main(String[] args) {
        List<ParkingSpot> parkingSpotList = new ArrayList<>();
        parkingSpotList.add(new CarParkingSpot(1, CAR));
        parkingSpotList.add(new BikeParkingSpot(2, BIKE));
        parkingSpotList.add(new CarParkingSpot(3, CAR));
        parkingSpotList.add(new BikeParkingSpot(4, BIKE));
        ParkingLot parkingLot = new ParkingLot(parkingSpotList);

        PriceStrategy basicPrice = new BasicPricing();
        PriceStrategy premiumPrice = new PremiumPricing();

        Vehicle car1 = new Car("12", CAR, basicPrice);
        Vehicle car22 = new Car("13", CAR, premiumPrice);
        Vehicle bike1 = new Bike("14", BIKE, basicPrice);
        Vehicle bike2 = new Bike("11", BIKE, premiumPrice);
        ParkingSpot carSpot = parkingLot.parkVehicle(car1);
        ParkingSpot bikeSpot = parkingLot.parkVehicle(bike1);

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. UPI");
        System.out.println("2. Credit Card");

        int paymentMethod = scanner.nextInt();

        if (carSpot != null) {

            double carFee = car1.calculateFee(2, PricingType.HOURLY);

            PaymentStrategy payment =
                    PaymentFactory.getPaymentStrategy(paymentMethod, carFee);

            payment.processPayment();

            parkingLot.vacateSpot(carSpot, car1);
        }

        if (bikeSpot != null) {

            double bikeFee = bike1.calculateFee(3, PricingType.DAY);

            PaymentStrategy payment =
                    PaymentFactory.getPaymentStrategy(paymentMethod, bikeFee);

            payment.processPayment();

            parkingLot.vacateSpot(bikeSpot, bike1);
        }
    }
}