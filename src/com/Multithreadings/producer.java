package com.Multithreadings;

public class producer extends Thread{
    company c;
    public producer(company c){
        this.c=c;
    }
    public void run(){
        int i=1;
        while(true){
            this.c.produce_item( i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }
            i++;

        }
    }
}
