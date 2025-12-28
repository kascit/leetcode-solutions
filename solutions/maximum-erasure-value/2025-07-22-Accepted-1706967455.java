/*
 * Submission: 1706967455
 * Problem: Maximum Erasure Value (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-22 08:29:03 UTC
 * Runtime: 5 ms
 * Memory: 59.9 MB
 */

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int[] freq = new int[10001];
        int left = 0, sum = 0, max = 0;

        for (int right = 0; right < n; right++) {
            int val = nums[right];
            while (freq[val] > 0) {
                freq[nums[left]]--;
                sum -= nums[left];
                left++;
            }
            freq[val]++;
            sum += val;
            if (sum > max) max = sum;
        }

        return max;
    }
}
