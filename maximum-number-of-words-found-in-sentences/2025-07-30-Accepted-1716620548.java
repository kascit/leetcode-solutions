/*
 * Submission: 1716620548
 * Problem: Maximum Number of Words Found in Sentences (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-30 05:00:56 UTC
 * Runtime: 5 ms
 * Memory: 44 MB
 */

class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans = 0;
        for (String s : sentences){
            int cur = (int) s.chars().filter(c -> c == ' ').count() + 1;
            ans = (ans > cur) ? ans : cur;
        }
        return ans;
    }
}