/*
 * Submission: 1716619659
 * Problem: Maximum Number of Words Found in Sentences (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-30 05:00:07 UTC
 * Runtime: 5 ms
 * Memory: 44.1 MB
 */

class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans = 0;
        for (String s : sentences){
            int cur = countWords(s);
            ans = (ans > cur) ? ans : cur;
        }
        return ans;
    }

    int countWords(String s){
        return (int) s.chars().filter(c -> c == ' ').count() + 1;
    }
}