package com.SystemDesign.SOLID.LiskovSol.rules;

class Parent{
    void printMsg(String msg){
        System.out.println("printing parent msg "+msg);
    }

}
class Child extends Parent{
    @Override
    void printMsg(String msg){
        System.out.println("child class msg "+msg);
    }
}
class Client{
    Parent p;
    public Client(Parent p){
        this.p=p;
    }
    void printMsges(){
        p.printMsg("Hey");
    }
}
public class SignatureRule {

    public static void main(String[] args) {
        Parent parent=new Parent();
        Parent child=new Child();
        Client client1=new Client(child);
        client1.printMsges();


    }



}
