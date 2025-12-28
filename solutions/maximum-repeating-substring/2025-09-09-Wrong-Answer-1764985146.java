/*
 * Submission: 1764985146
 * Problem: Maximum Repeating Substring (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-09 14:04:55 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int maxRepeating(String sequence, String word) {
        int i = -1, ans = 0;
        while (true) {
            i = sequence.indexOf(word,i+1);
            // System.out.println(i);
            if (i == -1) break;
            ans++;
        }
        return ans;
    }
}