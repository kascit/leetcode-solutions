/*
 * Submission: 1757918619
 * Problem: Next Permutation (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-03 06:54:28 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public void nextPermutation(int[] nums) {
        int r = nums.length - 1, idx = 0;
        for (int i = r; i >= 1; i--) {
            if (nums[i-1] < nums[i]) {
                if (i == r) {
                    int temp = nums[i-1];
                    nums[i-1] = nums[i];
                    nums[i] = temp;
                    return;
                }
                idx = i - 1;
                break;
            }
        }
        Arrays.sort(nums,idx,r+1);
    }
}