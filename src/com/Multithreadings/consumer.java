package com.Multithreadings;

public class consumer extends Thread {
    company c;
    public consumer(company c) {
        this.c=c;
    }
    public void run(){
        int i=1;
        while(true){
            this.c.consume_item(i);
            try{
               Thread.sleep(1000);
            }catch(Exception e){

            }
            i++;
        }
    }
}
