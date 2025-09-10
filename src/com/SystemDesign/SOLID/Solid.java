package com.SystemDesign.SOLID;

public class Solid {

    //single responsibilty to change
//patternStar class should have patternStar responsibilty or reason to change


    String name;
    String color;
    int price;
    int year;

    public Solid(String name, String color, int price, int year) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.year = year;
    }
}

/*class Invoice{
   private Marker marker;
   private int quantity;

    public Invoice(int quantity, Marker marker) {
        this.quantity = quantity;
        this.marker = marker;
    }

    public int Calculation(Marker marker,int quantity){
        int price= ((marker.price)*(this.quantity));
        return price;
    }
    public void printInvoice(){
        //print the invoice
    }
    public void saveDb(){
        //save to database
    }

}*/
