package com.SystemDesign.SOLID;

public interface invoiceInterface {

    //open/close principle

    void save(Invoice invoice);

}
class saveToDb implements invoiceInterface{
    @Override
  public void save(Invoice invoice){
        //save to database
    }
}
class SaveToFile implements invoiceInterface{
    @Override
    public void save(Invoice invoice){
        //save in db
    }

}
class SaveToMongoDB implements invoiceInterface{
    @Override
    public void save(Invoice invoice){
        //save to mongo db
    }

}