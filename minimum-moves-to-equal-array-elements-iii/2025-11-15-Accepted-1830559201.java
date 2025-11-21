/*
 * Submission: 1830559201
 * Problem: Minimum Moves to Equal Array Elements III (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-15 17:30:27 UTC
 * Runtime: 1 ms
 * Memory: 46.2 MB
 */

class Solution {
    public int minMoves(int[] nums) {
        int sum = 0, max = Integer.MIN_VALUE, len = nums.length;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            if (nums[i] > max) max = nums[i];
        } return max*len - sum;
    }
}