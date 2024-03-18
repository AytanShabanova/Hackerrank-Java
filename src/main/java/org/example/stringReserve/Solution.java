package org.example.stringReserve;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean isPalindrome = true;
        for (int i = 0; i < A.length() / 2; i++) {
            if (A.charAt(i) != A.charAt(A.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        // Print output
        if (isPalindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }



    }
}
