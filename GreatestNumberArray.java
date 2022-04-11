package com.syntax.interviewQP;

public class GreatestNumberArray {
    public static void main(String[] args) {
        int []  array = {10,3,5,2,7,3,2,2,9,12,9};
        int greatestNumber=array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>greatestNumber){
                greatestNumber=array[i];
            }
        }
        System.out.println(greatestNumber);
    }
}
