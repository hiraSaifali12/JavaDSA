package com.Multithreadings;

public class MyThreads implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            System.out.println("the value of i="+i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){

            }
        }

    }

    public static void main(String[] args) {
        MyThreads t2=new MyThreads();
        Thread thread=new Thread(t2);

        myThread t1=new myThread();
        t1.start();
        thread.start();
    }
}
