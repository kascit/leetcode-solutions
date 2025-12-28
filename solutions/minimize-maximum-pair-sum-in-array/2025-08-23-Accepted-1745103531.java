/*
 * Submission: 1745103531
 * Problem: Minimize Maximum Pair Sum in Array (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-23 07:09:14 UTC
 * Runtime: 51 ms
 * Memory: 58.1 MB
 */

class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int l = 0, r = len - 1;
        int max = 0;
        while (l < r) {
            int cur = nums[l]+nums[r];
            max = (max > cur) ? max : cur;
            l++;
            r--;
        }
        return max;
    }
}