package com.DataStructure.Recursion;

public class countZeroInNum {

    public static int count(int n){
        return helper(n,0);
    }
    private static int helper(int n,int cnt){
        if(n==0) return cnt;
        int rem=n%10;
        if(rem==0) return helper(n/10,cnt+1);
        else return helper(n/10,cnt);
    }

    public static void main(String[] args) {

       int ans= count(2001004);
        System.out.println(ans);

    }
}
