package com.ReadCSVfile;

public class readMain {
    public static void main(String[] args) {
        String filePath = "/Users/hirasaifali/Downloads/annual-enterprise-survey-2024-financial-year-provisional-size-bands.csv";
        read rt=new read(filePath);
        Thread t=new Thread(rt);
        t.start();



    }
}
