package com.OOPS.java8.interfaces;

public class abc implements A_interface, B_interface{
    @Override
    public int show() {
        return 0;
    }

    @Override
    public String shows() {
        return "hey";
    }

    @Override
    public int bark() {
        return 0;
    }
    @Override
   public boolean look(){
        System.out.println("No see");
        return false;
    }

    public static void main(String[] args) {
        abc ob=new abc();
       boolean bol= ob.look();
        String ans=ob.eat();
        System.out.println(bol);
        System.out.println(ans);
    }
}
