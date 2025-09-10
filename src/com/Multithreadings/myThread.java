package com.Multithreadings;

public class myThread extends Thread{
public void run(){
    for(int i=10;i>=0;i--){
        System.out.println(i+" Hira");
        try{
            Thread.sleep(2000);
        }catch(Exception e){

        }
    }
}
}
