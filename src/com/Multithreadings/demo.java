package com.Multithreadings;
class Printing{
    private int number=1;
    private int limit;
    public Printing(int limit){
       this.limit=limit;
    }
    public synchronized void printValue(int threadId){
        while(number<=limit){
            while((number-1)%3!=threadId){
            if(number>limit){
                return;
            }
            try {
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            }
            if(number<=limit){
                System.out.println("Thread-"+(threadId+1)+":"+number);
                number++;
            }
            notifyAll();
        }
    }
}
 class MyThread implements Runnable{
private Printing printing;
private int threadId;
public MyThread(Printing printing,int threadId){
    this.printing=printing;
    this.threadId=threadId;
}
     @Override
     public void run() {
printing.printValue(threadId);
     }
 }
public class demo {
    public static void main(String[] args) {
        Printing printing=new Printing(10);
Thread t1=new Thread(new MyThread(printing,0));
        Thread t2=new Thread(new MyThread(printing,1));
        Thread t3=new Thread(new MyThread(printing,2));
        t1.start();
        t2.start();
        t3.start();

    }
}
