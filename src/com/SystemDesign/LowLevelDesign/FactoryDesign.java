package com.SystemDesign.LowLevelDesign;


//Factory Pattern provides a way to create objects without exposing the creation logic.

interface Shape{
    void draw();
}
class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Shape");
    }
}
public class FactoryDesign {
    public static FactoryDesign getInstance(String objName){
        if(objName.equalsIgnoreCase("Circle")){
         //  return new Circle();
        }else if(objName.equalsIgnoreCase("square")){
           // return new Square();
        }
        return null;
    }

}
