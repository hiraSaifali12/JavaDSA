package com.SystemDesign.SOLID.LiskovSol;

import java.util.ArrayList;
import java.util.List;

interface NonWithdrawAc{
    void diposite(double amount);
}
interface WithdrawAc extends NonWithdrawAc{
    void withdraw(double amount);
}

class FD implements NonWithdrawAc{

    private double balance;
    public FD(){
        balance=0;

    }

    @Override
    public void diposite(double amount) {
        balance+=amount;
        System.out.println("amount credit :"+amount+" current balance is "+balance);

    }

}
class SaveAc implements WithdrawAc{

    private double balance;
    public SaveAc(){
        balance=0;

    }

    @Override
    public void diposite(double amount) {
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
class CurrAc implements WithdrawAc{

    private double balance;
    public CurrAc(){
        balance=0;

    }

    @Override
    public void diposite(double amount) {
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
class Bank{
    private List<WithdrawAc> withdrawableAccounts;
    private List<NonWithdrawAc> depositOnlyAccounts;

    public Bank(List<WithdrawAc> withdrawableAccounts,
                      List<NonWithdrawAc> depositOnlyAccounts) {
        this.withdrawableAccounts = withdrawableAccounts;
        this.depositOnlyAccounts = depositOnlyAccounts;
    }

    public void processTransactions() {
        for (WithdrawAc acc : withdrawableAccounts) {
            acc.diposite(1000);
            acc.withdraw(500);
        }
        for (NonWithdrawAc acc : depositOnlyAccounts) {
            acc.diposite(5000);
        }
    }
}
public class FollowLiskov {

    public static void main(String[] args) {
        List<WithdrawAc> withdrawableAccounts = new ArrayList<>();
        withdrawableAccounts.add(new SaveAc());
        withdrawableAccounts.add(new CurrAc());

        List<NonWithdrawAc> depositOnlyAccounts = new ArrayList<>();
        depositOnlyAccounts.add(new FD());

        Bank bank = new Bank(withdrawableAccounts, depositOnlyAccounts);
        bank.processTransactions();
    }
}
