package com.DataStructure.Recursion;

public class practice {

    static void func(int n){
        if(n==0) return;

        //1.  print 1 to n
        func(n-1);
        System.out.println(n);

        //2.  print n to 1
        //func(n-1);
    }
    public static int func1(int n){
        //3. total product of num or fectorial
        if(n<=0) return 1;
        return n*func1(n-1);
    }
    public static int func2(int n){
        //4.  total sum of num
        if(n==0) return 0;
        return n+func2(n-1);
    }

    public static int func3(int n){

        //5.  sum of digits
        if(n==0) return 0;
        return (n%10)+func3(n/10);

    }
    public static int func4(int n){
        //6.   product of digits
        if(n==0) return 1;
        return (n%10)*func4(n/10);
    }
    static  int sum=0;
    public static  void func5(int n){
        //7. reverse a digit
      //  int sum=0;
        if(n==0) return;
       // int rem = n%10;
      //  sum=sum*10+rem;
        System.out.print(n%10);
        func5(n/10);


    }
    public static void main(String[] args) {
     //  int ans=func5(8976);
       // System.out.println(ans);

        func5(5686);
      //  System.out.println(sum);

    }
}
