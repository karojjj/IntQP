package com.syntax.interviewQP;

import java.util.ArrayList;

public class ArrayDuplicates {
    static int firstOfDuplicateInt;
    static String firstOfDuplicateStr;
  static  void showDuplicates(int [] array){

      ArrayList<Integer> checked = new ArrayList<>();
      for (int i = 0; i < array.length; i++) {
          int count = 0;
          if (!checked.contains(array[i])) {
              for (int j = 0; j < array.length; j++) {
                  if (j != i && array[i] == array[j]) {
                      firstOfDuplicateInt = array[j];
                      count++;
                  }
              }
          }
          if (count != 0) {
              System.out.println("element: " + firstOfDuplicateInt + " has " + count + " duplicates");
              checked.add(array[i]);
          }
      }

    }
    static  void showDuplicates(String [] array){

        ArrayList<String> checked = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            if (!checked.contains(array[i])) {
                for (int j = 0; j < array.length; j++) {
                    if (j != i && array[i].equals(array[j])) {
                        firstOfDuplicateStr = array[j];
                        count++;
                    }
                }
            }
            if (count != 0) {
                System.out.println("element: " + firstOfDuplicateStr + " has " + count + " duplicates");
                checked.add(array[i]);
            }
        }

    }
    public static void main(String[] args) {
        // how to find duplicates in the array
        System.out.println("Array of integers:");
        int []  array = {2,3,5,2,7,3,2,2,9,12,9};
        showDuplicates(array);

        System.out.println("Array of Strings:");
        String [] arrayStr = {"a", "oho", "a", "lol","ah", "lol", "lol"};
        showDuplicates(arrayStr);




        int[] arrayH= {2,3,4,5,6,7,8,9};

        boolean a=true;
        for(int i=0;i<arrayH.length;i++) {
            for (int j = 0; j < arrayH.length; j++) {
                if (arrayH[i] == arrayH[j]) {
                }}

        }
        System.out.println(a);

    }
}
