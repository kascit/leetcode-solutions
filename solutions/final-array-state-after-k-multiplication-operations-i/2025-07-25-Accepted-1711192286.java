/*
 * Submission: 1711192286
 * Problem: Final Array State After K Multiplication Operations I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-25 16:01:10 UTC
 * Runtime: 1 ms
 * Memory: 44.8 MB
 */

class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while (k > 0) {
            int x = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[x]) {
                    x = i;
                }
            }
            nums[x] = nums[x] * multiplier;
            k--;
        }
        return nums;
    }
}