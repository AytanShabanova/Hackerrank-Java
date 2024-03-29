package org.example.aVeryBigSum;

import java.util.List;

public class Result {


        /*
         * Complete the 'aVeryBigSum' function below.
         *
         * The function is expected to return a LONG_INTEGER.
         * The function accepts LONG_INTEGER_ARRAY ar as parameter.
         */

        public static long aVeryBigSum(List<Long> ar) {
            long sum = 0;

            for (long num : ar) {
                sum += num;
            }

            return sum;
        }

    }
