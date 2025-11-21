/*
 * Submission: 1762574358
 * Problem: Max Consecutive Ones (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 11:12:19 UTC
 * Runtime: 2 ms
 * Memory: 50.7 MB
 */

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = 0, ans = 0;
        for(int n : nums) {
            if (n == 1) {
                len++;
            } else len = 0;
            if (len > ans) ans = len;
        } return ans;
    }
}