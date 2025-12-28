/*
 * Submission: 1603561848
 * Problem: Sum of Beauty of All Substrings (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-11 10:39:38 UTC
 * Runtime: 198 ms
 * Memory: 45.2 MB
 */

import java.util.*;

class Solution {
    public int beautySum(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26];
            TreeMap<Integer, Integer> freqMap = new TreeMap<>();
            for (int j = i; j < s.length(); j++) {
                int index = s.charAt(j) - 'a';
                
                // Remove old frequency from freqMap
                if (freq[index] > 0) {
                    int oldFreq = freq[index];
                    freqMap.put(oldFreq, freqMap.get(oldFreq) - 1);
                    if (freqMap.get(oldFreq) == 0)
                        freqMap.remove(oldFreq);
                }

                // Update frequency
                freq[index]++;

                // Add new frequency to freqMap
                freqMap.put(freq[index], freqMap.getOrDefault(freq[index], 0) + 1);

                // Get max and min frequencies efficiently
                int minFreq = freqMap.firstKey();
                int maxFreq = freqMap.lastKey();

                ans += maxFreq - minFreq;
            }
        }
        return ans;
    }
}
