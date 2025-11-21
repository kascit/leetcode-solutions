/*
 * Submission: 1705786774
 * Problem: Find Minimum Operations to Make All Elements Divisible by Three (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 10:15:34 UTC
 * Runtime: 0 ms
 * Memory: 42.4 MB
 */

class Solution {
    public int minimumOperations(int[] nums) {
        int ans = 0;
        for (int num : nums){
            if (num%3 != 0) ans++;
        }
        return ans;
    }
}