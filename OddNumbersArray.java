package com.syntax.interviewQP;

public class OddNumbersArray {
    public static void main(String[] args) {
        int []  array = {2,3,5,2,7,3,2,2,9,12,9};
        for (int ele:array){
            if(ele%2!=0){
                System.out.print(ele+" ");
            }
        }
        for (int ele:array){
            if(ele%2==0){
                System.out.print(ele+" ");
            }
        }
    }
}
