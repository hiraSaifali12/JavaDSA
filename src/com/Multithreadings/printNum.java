package com.Multithreadings;

class Printer{
  private  int number=1;
  private  int limit;
    public Printer(int limit){
        this.limit=limit;
    }
    public synchronized void printValue(int threadId){
        while(number<=limit){
            while((number-1)%3!=threadId){
                if(number>limit){
                    return;
                }
                try{
                   wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            if(number<=limit){
                System.out.println("thread-"+(threadId+1)+":"+number);
                number++;
            }
            notifyAll();
        }
    }
}
class MyRunnable implements Runnable{
    private Printer printer;
    private int threadId;
    public MyRunnable(Printer printer, int threadId){
        this.printer=printer;
        this.threadId=threadId;
    }
    @Override
  public  void run(){
printer.printValue(threadId);
    }

}
public class printNum {
    public static void main(String[] args) {
        Printer printer=new Printer(10);
        Thread t1=new Thread(new MyRunnable(printer,0) );
        Thread t2=new Thread(new MyRunnable(printer,1));
        Thread t3=new Thread(new MyRunnable(printer,2));
        t1.start();
        t2.start();
        t3.start();


    }
}
