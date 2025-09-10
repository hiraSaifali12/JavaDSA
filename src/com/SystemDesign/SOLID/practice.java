package com.SystemDesign.SOLID;

import java.util.ArrayList;
import java.util.List;

class Product{
    int price;
    String name;
    public Product(int price,String name){
        this.price=price;
        this.name=name;
    }
}
class shoppingCart{
    List<Product> product=new ArrayList<>();
    void addProduct(Product pro){
        product.add(pro);

    }
    List<Product> getProduct(){
       return product;
    }
    double totalPrice(){
        int total=0;
        for(Product i : product){
            total+=i.price;
        }
        return total;
    }
    public void saveInvoice(){
        for(Product p : product ){
            System.out.println(p.price +" "+p.name);
        }
        System.out.println("total price -> "+totalPrice());
    }
   public  void  saveToDb(){
       System.out.println("save to database");
    }

}
public class practice {
    public static void main(String[] args) {

        shoppingCart cart=new shoppingCart();
        cart.addProduct(new Product(20,"bread"));
        cart.addProduct(new Product(50, "egg"));
        //System.out.println("total price :"+cart.totalPrice());
        cart.saveInvoice();
        cart.saveToDb();

    }

}
