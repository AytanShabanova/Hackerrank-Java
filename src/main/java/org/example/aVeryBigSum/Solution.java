package org.example.aVeryBigSum;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int arCount = Integer.parseInt(bufferedReader.readLine().trim());

            String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Long> ar = new ArrayList<>();

            for (int i = 0; i < arCount; i++) {
                long arItem = Long.parseLong(arTemp[i]);
                ar.add(arItem);
            }

            long result = Result.aVeryBigSum(ar);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

