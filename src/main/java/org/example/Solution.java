package org.example;

import java.io.DataInput;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Solution {



        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String B=sc.next();
           int length= A.length()+B.length();
            System.out.println(length);
            String comparisonResult = (A.compareTo(B) > 0) ? "Yes" : "No";
            System.out.println(comparisonResult);
            String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
            String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);


            System.out.println(capitalizedA + " " + capitalizedB);
            /* Enter your code here. Print output to STDOUT. */

        }
    }



