package org.example.stairCase;

public class Result {


        /*
         * Complete the 'staircase' function below.
         *
         * The function accepts INTEGER n as parameter.
         */

        public static void staircase(int n) {
            // Write your code here
            for (int i = 0; i < n; i++) {
                // Print spaces
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
                // Print '#'
                for (int k = 0; k <= i; k++) {
                    System.out.print("#");
                }
                // Move to the next line
                System.out.println();
            }

        }

    }

