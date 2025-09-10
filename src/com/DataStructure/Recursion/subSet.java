package com.DataStructure.Recursion;

import java.util.Scanner;

public class subSet {
    public static void func(String ip,String op){
    if(ip.length()==0) {
        System.out.println(op);
        return;
    }

    String op1=op;
    String op2=op;
   // op2.push_back(ip[0]);
    //ip.erase(ip.begin()+0);
        op2 = op2 + ip.charAt(0); // push_back equivalent
        ip = ip.substring(1);// erase equivalent

    func(ip,op1);
    func(ip,op2);
    return;
    }

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        String s= "abc";
        func(s,"");
     //   System.out.println();

    }

}
