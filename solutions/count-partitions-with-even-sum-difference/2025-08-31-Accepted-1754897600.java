/*
 * Submission: 1754897600
 * Problem: Count Partitions with Even Sum Difference (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-31 15:16:01 UTC
 * Runtime: 0 ms
 * Memory: 42 MB
 */

class Solution {
    public int countPartitions(int[] nums) {
        int len = nums.length, sum = 0;
        // int[] pref = new int[len];
        for (int i = 0; i < len; i++) {
            sum+=nums[i];
            // pref[i] = sum;
        }
        if ((sum&1) == 1) return 0;
        // sum = 0;
        return len - 1;        
    }
}