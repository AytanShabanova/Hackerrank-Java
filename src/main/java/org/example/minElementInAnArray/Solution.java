package org.example.minElementInAnArray;

public class Solution {
    public static void main(String[] args) {
arr();
    }
    public static void arr(){
     int arr[]={15,50,3,48,1,59,52,74};
     int min=arr[0];
        for (int i = 1; i <arr.length; i++) {
           if (arr[i]<min){
             min=arr[i];
           }

        }
        System.out.println(min);
    }

}
