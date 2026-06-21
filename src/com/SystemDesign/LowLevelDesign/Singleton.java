package com.SystemDesign.LowLevelDesign;


//Singleton ensures that only one instance of a class is created and provides a global access point.


public class Singleton {
  private  static Singleton instance;
  private Singleton(){}
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
class Singleton1{
   private static Singleton1 instance;
 private  Singleton1(){}
    public static synchronized Singleton1 getInstance(){
        if(instance==null){
            instance=new Singleton1();
        }
        return instance;
    }
}

class Singleton2{
    private static volatile Singleton2 instance;
    private  Singleton2(){}
    public static Singleton2 getInstance(){
        if(instance==null){
            synchronized (Singleton2.class){
            instance=new Singleton2();
        }
        }
        return instance;
    }
}