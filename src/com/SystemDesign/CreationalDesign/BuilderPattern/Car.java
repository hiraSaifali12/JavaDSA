package com.SystemDesign.CreationalDesign.BuilderPattern;

public class Car {
    private  String engine;
    private  boolean navigationSystem;
    private  boolean sunRoof;
    private int seats;
    private int wheels;
    private String color;
   private Car(BuilderCar bulider){
        this.engine=bulider.engine;
        this.navigationSystem=bulider.navigationSystem;
        this.sunRoof=bulider.sunRoof;
        this.seats=bulider.seats;
        this.wheels=bulider.wheels;
        this.color=bulider.color;
    }
    public String getEngine(){
        return engine;
    }
    public boolean hasNavigationSystem(){
        return navigationSystem;
    }
    public boolean hasSunRoof(){
        return sunRoof;
    }
    public int getSeats(){
       return seats;
    }
    public int getWheels(){
        return wheels;
    }
    public String getColor(){
        return color;
    }
    @Override
    public String toString(){
        return "Car [engine=" + engine + ", wheels=" + wheels + ", seats=" + seats
                + ", color=" + color + ", sunroof=" + sunRoof
                + ", navigationSystem=" + navigationSystem + "]";
    }

    static class BuilderCar{
        private  String engine;
        private  boolean navigationSystem=false;
        private  boolean sunRoof=true;
        private int seats=5;
        private int wheels=4;
        private String color="black";
       public BuilderCar(){
           this.engine=engine;
           this.navigationSystem=navigationSystem;
           this.sunRoof=sunRoof;
           this.seats=seats;
           this.wheels=wheels;
           this.color=color;
       }
       public BuilderCar setEngine(String engine){
           this.engine=engine;
           return this;
       }
        public BuilderCar setNavigationSystem(boolean navigationSystem){
            this.navigationSystem=navigationSystem;
            return this;
        }
        public BuilderCar setSunRoof(boolean sunRoof){
            this.sunRoof=sunRoof;
            return this;
        }
        public BuilderCar setSeats(int seats){
            this.seats=seats;
            return this;
        }
        public BuilderCar setWheels(int wheels){
            this.wheels=wheels;
            return this;
        }
        public BuilderCar setColor(String color){
            this.color=color;
            return this;
        }

       public Car build(){
           return new Car(this);
       }

    }

}

