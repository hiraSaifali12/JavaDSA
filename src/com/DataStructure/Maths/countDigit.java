package com.DataStructure.Maths;

public class countDigit {
 public static int digit(int dig){
     int cnt=0;
     while(dig>0){
         cnt++;
         dig=dig/10;
     }
     return cnt;
 }
 public static int rev(int num){
     int ans=0;
     int rem=0;
     while(num>0){
         rem= num%10;
         ans=ans*10+rem;
         num=num/10;

     }
     return ans;
 }
public static void palindrom(int pal){
    if(pal==rev(pal)){
        System.out.println("palindrom num");
    }
    else{
        System.out.println("Not palindrom");
    }
}
public static boolean palNum(int num){
    int ans=0;
    int num1=num;
    int rem=0;
    while(num>0){
        rem= num%10;
        ans=ans*10+rem;
        num=num/10;

    }
    if(ans==num1){
        return true;
    }
    return false;

}
    public static void main(String[] args) {
       // int digg=12345;
      // int ans=digit(digg);
      //  System.out.println(ans);
       /* int ans=rev(digg);
        System.out.println(ans);*/
       /* int pal=1224221;
        palindrom(pal);*/
        int pal=12246221;
        boolean palBool=palNum(pal);
        System.out.println(palBool);

    }
}
