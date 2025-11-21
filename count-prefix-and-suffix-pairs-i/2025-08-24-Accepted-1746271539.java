/*
 * Submission: 1746271539
 * Problem: Count Prefix and Suffix Pairs I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 06:34:51 UTC
 * Runtime: 2 ms
 * Memory: 42 MB
 */

class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int ans = 0, len = words.length;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if (words[j].startsWith(words[i]) && words[j].endsWith(words[i])) ans++;
            }
        } return ans;
    }
}