package com.syntax.interviewQP;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HasSetDuplicates {
    static void duplicateRemover(int[]array){
        HashSet<Integer> duplicateRemover = new HashSet<>();

        for(int element:array) {
            if (!duplicateRemover.add(element)){
                System.out.println(element);
            }
        }
    }
   static void duplicateRemover(String []array){
        HashSet<String> duplicateRemover = new HashSet<>();

        for(String element:array) {
            if (!duplicateRemover.add(element)){
                System.out.println(element);
            }
        }
    }
    static void duplicateRemoverMap(String [] array){
        HashMap<String, Integer> elementAndCount = new HashMap<>();

        for (String element : array) {
            Integer count = elementAndCount.get(element);
            if (count == null) {
                elementAndCount.put(element, 1);

            } else {
                elementAndCount.put(element, ++count);
            }
        }
        Set<Map.Entry<String, Integer>> entrySet = elementAndCount.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println( "There are " + entry.getValue()+" elements of "+entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Array of integers:");
        int []  array = {2,3,5,2,7,3,2,2,9,12,9};
duplicateRemover(array);

        System.out.println("Array of Strings:");
        String [] arrayStr = {"a", "oho", "a", "lol","ah", "lol", "lol"};
duplicateRemover(arrayStr);

        System.out.println("Third way:");
        duplicateRemoverMap(arrayStr);


    }
}
