package com.SystemDesign.SOLID;


import java.util.ArrayList;
import java.util.List;

class Products{
    int price;
    String name;
    public Products(int price,String name){
        this.price=price;
        this.name=name;
    }
}
class ShopingCart{
    List<Products> product=new ArrayList<>();
    void setProduct(Products pro){
        product.add(pro);
    }
    List<Products> getProduct(){
        return product;
    }
    double totalPrice(){
        double total=0;
        for(Products p : product){
            total+=p.price;
        }
        return total;
    }

}
class saveInvoice{
    ShopingCart cart;
    public saveInvoice(ShopingCart cart){
       this.cart=cart;
    }
    void printInvoice(){
        for(Products p : cart.getProduct()){
            System.out.println(p.name+" "+p.price);
        }
        System.out.println("total price : "+cart.totalPrice());
    }
}
/*-------<<voilation of open close>>-------
class SaveToDb{
    ShopingCart cart;
    public SaveToDb(ShopingCart cart){
        this.cart=cart;
    }
    void saveToSQL(){
        System.out.println("save in database");
    }
    void saveToFile(){
        System.out.println("save in file");
    }
    void saveToMongo(){
        System.out.println("save to mongo db");
    }


}*/
interface saveToDatabase{

    void save();
}
class saveToSQL implements saveToDatabase{
    ShopingCart cart;
    public saveToSQL(ShopingCart cart){
        this.cart=cart;
    }
    @Override
    public void save() {
        System.out.println("save in mysql database");
    }
}
class saveToFile implements saveToDatabase{
    ShopingCart cart;
    public saveToFile(ShopingCart cart){
        this.cart=cart;
    }
    @Override
    public void save() {
        System.out.println("save in file");

    }
}
class saveToMongo implements saveToDatabase{
    ShopingCart cart;
    public saveToMongo(ShopingCart cart){
        this.cart=cart;
    }
    @Override
    public void save() {
        System.out.println("save to mongo db");
    }
}

public class FollowSRP {
    public static void main(String[] args) {
        ShopingCart sc=new ShopingCart();
        sc.setProduct(new Products(30,"egg"));
        sc.setProduct(new Products(60,"milk"));
        sc.setProduct(new Products(70,"bread"));

        saveInvoice print=new saveInvoice(sc);
        print.printInvoice();
//        SaveToDb db=new SaveToDb(sc);
//        db.saveToSQL();
//        db.saveToFile();
//        db.saveToMongo();

        saveToSQL sql=new saveToSQL(sc);
        sql.save();
        saveToMongo mongo=new saveToMongo(sc);
        mongo.save();




    }

}
