/*
 * Submission: 1836035382
 * Problem: Maximum Number of Operations With the Same Score I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-21 14:02:16 UTC
 * Runtime: 0 ms
 * Memory: 43.3 MB
 */

class Solution {
    public int maxOperations(int[] nums) {
        int sum = -1;
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i+=2) {
            if (sum == -1) {
                sum = nums[i] + nums[i+1];
            }
            else if (sum != nums[i] + nums[i+1]) return ans;
            ans++;
        } return ans;
    }
}