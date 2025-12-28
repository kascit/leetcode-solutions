/*
 * Submission: 1705785419
 * Problem: Find Minimum Operations to Make All Elements Divisible by Three (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-07-21 10:14:11 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int minimumOperations(int[] nums) {
        int ans = 0;
        for (int num : nums){
            ans += num%3;
        }
        return ans;
    }
}