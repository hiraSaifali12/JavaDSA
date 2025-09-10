package com.OOPS.java8.lambda;


  interface A{
    void add(int i);
}
 /*class abc implements A {
     public void add() {
         System.out.println("add 2+3=?");


     }
 }*/

public class lamb {
    public static void main(String[] args) {
     /*   abc obj = new abc();
        obj.add();*/
        // A obj=()-> System.out.println("hello new interface implementation");

A obj= i -> System.out.println("hey"+i);

obj.add(10);
    }
}

