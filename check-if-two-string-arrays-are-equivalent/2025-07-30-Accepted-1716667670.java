/*
 * Submission: 1716667670
 * Problem: Check If Two String Arrays are Equivalent (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-30 05:45:05 UTC
 * Runtime: 0 ms
 * Memory: 41.9 MB
 */

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int len = word1.length, len2 = word2.length;
        int max = (len > len2) ? len : len2;
        for (int i = 0; i < max; i++){
            if (i < len) sb.append(word1[i]);
            if (i < len2) sb2.append(word2[i]);
        }
        return sb.toString().equals(sb2.toString());
    }
}