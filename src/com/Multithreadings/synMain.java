package com.Multithreadings;

public class synMain {
    public static void main(String[] args) {
        company cmp=new company();
        producer p=new producer(cmp);
        consumer c=new consumer(cmp);
        p.start();
        c.start();
    }

}
