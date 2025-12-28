/*
 * Submission: 1762387943
 * Problem: Maximum Score After Splitting a String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 07:27:17 UTC
 * Runtime: 1 ms
 * Memory: 41.3 MB
 */

class Solution {
    public int maxScore(String s) {
        int len = s.length();
        int ones = 0;
        for (int i = 0; i < len; i++) {
            ones += s.charAt(i) - '0';
        }
        int zeros = 0, ans = 0;
        for (int i = 0; i < len - 1; i++) {
            if (s.charAt(i) == '0') zeros++;
            else ones--;
            ans = Math.max(ans,zeros+ones);
        } return ans;
    }
}