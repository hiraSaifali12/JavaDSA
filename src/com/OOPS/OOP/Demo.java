package com.OOPS.OOP;
class Employee{
    private String name;
    private int age;
    public  void setName(String name){
        this.name=name;
    }
    public String getName(){
    return name;
    }
}
 abstract class Department{
abstract void nameDept();
public void doWork(){
    System.out.println("9to5");
}
}
class It extends Department{
    public void nameDept(){
        System.out.println("department name is ");
    }
}
interface Payment{
    void pay();
}
class phonePay implements  Payment{
    @Override
   public void pay(){
        System.out.println("doing payment");
    }
}
interface Bird{
    void fly();
}
class Eagle implements Bird{
    public void fly(){
        System.out.println("can fly");
    }
}
class babyEagle extends Eagle{
    @Override
    public void fly(){
        System.out.println("it can not fy rn");
    }
}
class Math{

    public int sum(int a , int b){
        return a+b;
    }
    public int sum(int a, int b,int c){
       return a+b+c;
    }

}

public class Demo {
    public static void main(String[] args) {
Employee emp=new Employee();
emp.setName("hira");
Eagle bird= new Eagle();
        Eagle birdBaby=new babyEagle();
        birdBaby.fly();

bird.fly();

       // System.out.println(emp.getName());
    }
}
