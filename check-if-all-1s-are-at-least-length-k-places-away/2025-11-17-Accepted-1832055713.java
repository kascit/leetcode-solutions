/*
 * Submission: 1832055713
 * Problem: Check If All 1's Are at Least Length K Places Away (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-17 07:08:28 UTC
 * Runtime: 1 ms
 * Memory: 65.5 MB
 */

class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int len = nums.length;
        int prev = -k -1;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 1) {
                if (i - prev <= k) return false;
                prev = i;
            }
        } return true;
    }
}