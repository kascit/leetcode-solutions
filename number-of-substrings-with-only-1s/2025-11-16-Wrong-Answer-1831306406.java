/*
 * Submission: 1831306406
 * Problem: Number of Substrings With Only 1s (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-11-16 12:23:26 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int numSub(String s) {
        int len = s.length(), cnt = 0, ans = 0;
        for (int i = 0; i < len; i++) {
            cnt += s.charAt(i) - '0';
            if (i == len - 1 || s.charAt(i) == '0') {
                ans += cnt*(cnt+1)/2;
                cnt = 0;
            }
        } return ans;
    }
}