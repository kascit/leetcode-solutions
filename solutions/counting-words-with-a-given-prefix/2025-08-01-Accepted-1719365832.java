/*
 * Submission: 1719365832
 * Problem: Counting Words With a Given Prefix (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-01 10:04:03 UTC
 * Runtime: 0 ms
 * Memory: 42.9 MB
 */

class Solution {
    public int prefixCount(String[] words, String pref) {
        int cnt = 0;
        for (String word : words){
            if (word.startsWith(pref)) cnt++;
        }
        return cnt;
    }
}