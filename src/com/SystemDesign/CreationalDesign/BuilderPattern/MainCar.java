package com.SystemDesign.CreationalDesign.BuilderPattern;

public class MainCar {
    public static void main(String[] args) {
        Car.BuilderCar builderCar=new Car.BuilderCar();
        Car car1=builderCar.setSunRoof(true).setEngine("A8").build();
        System.out.println(car1);
    }
}
