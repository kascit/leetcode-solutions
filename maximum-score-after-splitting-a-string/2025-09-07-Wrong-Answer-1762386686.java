/*
 * Submission: 1762386686
 * Problem: Maximum Score After Splitting a String (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-07 07:25:54 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int maxScore(String s) {
        int len = s.length();
        int ones = 0;
        for (int i = 0; i < len; i++) {
            ones += s.charAt(i) - '0';
        }
        int zeros = 0, ans = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '0') zeros++;
            else ones--;
            ans = Math.max(ans,zeros+ones);
        } return ans;
    }
}