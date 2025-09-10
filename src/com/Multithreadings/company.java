package com.Multithreadings;

public class company {
    int n;
    boolean f=false;

    //synchronize == no patternStar can interfare while working in bt current thread
    synchronized public void produce_item(int n){
        try{
            if(f){
                wait();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        this.n=n;
        System.out.println("produce :"+this.n);
        f=true;
        notify();

    }
    //synchronized when com=nsumer working producer can not interfare or not produce
    synchronized public int consume_item(int n){
        try{
            if(!f){
                wait();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("consume :"+this.n);
        f=false;
        notify();
        return this.n;

    }

}
