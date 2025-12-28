/*
 * Submission: 1698900861
 * Problem: Concatenation of Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-15 14:28:47 UTC
 * Runtime: 1 ms
 * Memory: 45.5 MB
 */

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n*2];
        for (int i = 0; i < 2*n; i++){
            ans[i] = nums[i%n];
        }

        return ans;

    }
}