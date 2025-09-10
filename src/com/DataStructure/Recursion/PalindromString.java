package com.DataStructure.Recursion;

public class PalindromString {
static boolean fun(String s,int i){
    if(i>=s.length()/2) return true;
    if(s.charAt(s.length() - i - 1) != s.charAt(i)) {
        return false;
    }
    return fun(s,i+1);


}
    public static void main(String[] args) {

        String s="MADAM";
        //int n=s.length();
        System.out.println(fun(s,0));
    }
}
