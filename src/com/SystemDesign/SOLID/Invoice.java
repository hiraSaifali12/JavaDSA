package com.SystemDesign.SOLID;

public class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculation(Marker marker,int quantity){
        int price = ((marker.price)*(this.quantity));
        return price;
    }
}
