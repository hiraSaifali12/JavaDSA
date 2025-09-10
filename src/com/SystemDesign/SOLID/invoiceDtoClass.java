package com.SystemDesign.SOLID;

public class invoiceDtoClass {


   //if this class is already testes and deployee and we have to do some modefication in our code ,
   // we do not make class like this only extend it not make modifecation on class
   private InvoicePrint invoicePrint;
   public invoiceDtoClass(InvoicePrint invoicePrint){
       this.invoicePrint = invoicePrint;
   }

   public void saveToDto(){

   }
}
