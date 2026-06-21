package com.Multithreadings;

import java.util.concurrent.*;
class producer implements Runnable{
    BlockingQueue<Integer> queue;
    public producer(BlockingQueue<Integer> queue){
        this.queue=queue;
    }
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                queue.put(i);
                System.out.println("produces valu: "+i);
            }}
        catch(Exception e){
            e.printStackTrace();

        }
    }
}
class consumer implements Runnable{
    BlockingQueue<Integer> queue;
    public consumer(BlockingQueue<Integer> queue){
        this.queue=queue;
    }
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                int value=  queue.take();
                System.out.println("consume valu: "+i);
            }}
        catch(Exception e){
            e.printStackTrace();

        }
    }
}

public class ProducerConsumerProblem {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        BlockingQueue<Integer> queue=new ArrayBlockingQueue<>(5);
        Thread t1=new Thread(new producer(queue));
        Thread t2=new Thread(new consumer(queue));
        t1.start();
        t2.start();
    }
}
