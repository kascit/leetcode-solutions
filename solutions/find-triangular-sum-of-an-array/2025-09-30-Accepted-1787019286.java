/*
 * Submission: 1787019286
 * Problem: Find Triangular Sum of an Array (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-30 07:27:19 UTC
 * Runtime: 42 ms
 * Memory: 44.5 MB
 */

class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length, len = n;
        while (n>0) {
            for (int i = 0; i < n - 1; i++) {
                nums[i] = (nums[i] + nums[i+1]) % 10;
            }
            n--;
            // System.out.println(Arrays.toString(nums));
        } return nums[0];
    }
}