package org.example.substringComparisons;

import java.util.Scanner;

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        char[] chArr = s.toCharArray();
        String[] str = new String[chArr.length-k+1];
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=0,j=k; i<str.length; i++,j++){
            str[i] = s.substring(j-k, j);
        }

        java.util.Arrays.sort(str);
        smallest = str[0];
        largest = str[str.length-1];
        return smallest + "\n" + largest;

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'


    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
