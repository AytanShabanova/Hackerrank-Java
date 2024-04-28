package org.example.bubble.sort;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
  arr();
    }
    public static void arr(){
        int arr[]={15,50,25,16};
        boolean sort=false;
        while (!sort) {
            sort=true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    sort=false;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
