/*
 * Submission: 1762450557
 * Problem: Occurrences After Bigram (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 08:44:39 UTC
 * Runtime: 2 ms
 * Memory: 41.5 MB
 */

import java.util.*;

class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split("\\s+");
        List<String> result = new ArrayList<>();
        
        for (int i = 0; i < words.length - 2; i++) {
            if (words[i].equals(first) && words[i + 1].equals(second)) {
                result.add(words[i + 2]);
            }
        }
        String[] res = new String[result.size()];
        for(int i = 0;i < result.size(); i++)
        {
            res[i] = result.get(i);
        }
        return res;
    }
}
