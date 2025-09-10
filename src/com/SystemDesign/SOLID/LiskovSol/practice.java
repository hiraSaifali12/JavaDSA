package com.SystemDesign.SOLID.LiskovSol;


import java.util.ArrayList;
import java.util.List;

interface Account{
    void deposite(double amount);
    void withdraw(double amount);
}
class CurrentAc implements Account{
    private double balance;
    public CurrentAc(){
        balance=0;

    }

    @Override
    public void deposite(double amount) {
        balance+=amount;
        System.out.println("amount credit :"+amount+" current balance is "+balance);

    }

    @Override
    public void withdraw(double amount) {
        if(balance>=amount){
            balance-=amount;
            System.out.println("amount withdraw :"+amount+"current balance is"+balance);
        }else {
            System.out.println("insuficient account balance");
        }

    }
}
class SavingAc implements Account{

    private double balance;
    public SavingAc(){
        balance=0;

    }

    @Override
    public void deposite(double amount) {
        balance+=amount;
        System.out.println("amount credit :"+amount+" current balance is "+balance);

    }

    @Override
    public void withdraw(double amount) {
        if(balance>=amount){
            balance-=amount;
            System.out.println("amount withdraw :"+amount+"current balance is"+balance);
        }else {
            System.out.println("insuficient account balance");
        }

    }
}
class FixDipAc implements Account{

    private double balance;
    public FixDipAc(){
        balance=0;

    }

    @Override
    public void deposite(double amount) {
        balance+=amount;
        System.out.println("amount credit :"+amount+" current balance is "+balance);

    }
    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("withdrawl not allowed");
    }
}
class BankClient{
    List<Account> accountList=new ArrayList<>();
    public BankClient(List<Account> accountList){
        this.accountList=accountList;
    }
     void processTransaction(){
        for(Account acc : accountList ){
            acc.deposite(1000.2);

            try{
                acc.withdraw(500);

            }catch(UnsupportedOperationException e){
                System.out.println("exception"+e.getMessage());
            }
        }
     }
     void processTransactionInBadWay(){
         for(Account acc : accountList ){
             acc.deposite(1000.2);
             if (acc instanceof FixDipAc) {
                 System.out.println("Skipping withdrawal for Fixed Term Account.");
             } else {

                 try {
                     acc.withdraw(500);

                 } catch (UnsupportedOperationException e) {
                     System.out.println("exception" + e.getMessage());
                 }
             }
         }
     }
}

public class practice {
    public static void main(String[] args) {
        List<Account> accountList=new ArrayList<>();
        accountList.add(new CurrentAc());
        accountList.add(new SavingAc());
        accountList.add(new FixDipAc());
        BankClient bc=new BankClient(accountList);
     //   bc.processTransaction();
        bc.processTransactionInBadWay();

    }
}
