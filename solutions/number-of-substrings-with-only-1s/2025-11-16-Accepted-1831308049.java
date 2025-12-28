/*
 * Submission: 1831308049
 * Problem: Number of Substrings With Only 1s (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-16 12:25:48 UTC
 * Runtime: 7 ms
 * Memory: 46.2 MB
 */

class Solution {
    public int numSub(String s) {
        int len = s.length();
        long cnt = 0, ans = 0;
        for (int i = 0; i < len; i++) {
            cnt += s.charAt(i) - '0';
            if (i == len - 1 || s.charAt(i) == '0') {
                ans += (cnt*(cnt+1)/2) % (int)(1e9+7) ;
                cnt = 0;
            }
        } return (int)ans;
    }
}