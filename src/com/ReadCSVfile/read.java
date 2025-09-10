package com.ReadCSVfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class read implements Runnable{
    private String filePath;
   public read(String filePath){
       this.filePath=filePath;

   }
   public void run(){
       try {
           BufferedReader br = new BufferedReader(new FileReader(filePath));
           String line;
           int lineNumber=1;

           while((line=br.readLine())!=null){
               System.out.println(Thread.currentThread().getName()+"reading"+line);
               lineNumber++;
           }
           br.close();
       }
       catch(IOException e){
           System.out.println("error reading file "+e.getMessage());
       }
    }
}
