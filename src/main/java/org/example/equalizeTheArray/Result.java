package org.example.equalizeTheArray;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {
    public static int equalizeArray(List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }

        int maxFrequency = Collections.max(frequencyMap.values());

        return arr.size() - maxFrequency;
    }
}
