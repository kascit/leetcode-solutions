/*
 * Submission: 1716631133
 * Problem: Minimum Operations to Exceed Threshold Value I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-30 05:10:44 UTC
 * Runtime: 1 ms
 * Memory: 43 MB
 */

class Solution {
    public int minOperations(int[] nums, int k) {
        int count = 0;
        for (int i : nums){
            count += (i < k) ? 1 : 0;
        }
        return count;
    }
}