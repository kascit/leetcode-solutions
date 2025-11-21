/*
 * Submission: 1762449991
 * Problem: Occurrences After Bigram (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 08:43:56 UTC
 * Runtime: 2 ms
 * Memory: 42 MB
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
        return result.toArray(new String[0]);
    }
}
