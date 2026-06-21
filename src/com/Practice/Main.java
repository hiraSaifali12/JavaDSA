package com.Practice;

import java.util.HashSet;

public class Main {
  /* @Override()
   public void finalize() throws  Throwable{
       System.out.println("GC takes place");

    }*/
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.greet();
        Manager m1=new Manager();
        m1.greet();
        Intern n1=new Intern();
        n1.greet();
//finally method
        int ans=1;
        try{
            ans=5/5;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("it will work");
        }


        //finalize
        String s=new String("hello");
        s=null;
        System.gc();



        //equals
        School scl1=new School();
        scl1.rollNo=1;
        scl1.name="Hira";
        School scl2=new School();
        scl2.rollNo=1;
        scl2.name="Hira";

        System.out.println(scl1.equals(scl2));



        String s1=new String("hello");
        String s2=new String("hello");
        System.out.println(s1.equals(s2));

     HashSet<School>set=new HashSet<>();
     set.add(scl1);
     set.add(scl2);
        System.out.println(set.size());

    }

}
