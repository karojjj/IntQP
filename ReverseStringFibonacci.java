package com.syntax.interviewQP;

public class ReverseStringFibonacci {
  static  int a,c = 0;
   static int b =1;
    public static void main(String[] args) {
        StringBuilder revString =new StringBuilder("aholA");
        revString.reverse();
        System.out.println(revString);



        int a=0 ,c = 0;
        int b =1;

        for (int i = 0; i < 12; i++) {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;


        }
    }
}
