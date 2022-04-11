package com.syntax.interviewQP;

import java.util.Arrays;
import java.util.Iterator;

public class IterateToPrintArray {
    public static void main(String[] args) {
        int []  array = {2,3,5,2,7,3,2,2,9,12,9};
        for(int ele:array){
            System.out.print(ele+" ");
        }
        System.out.println();
        Iterator<Integer> it = Arrays.stream(array).iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
}
