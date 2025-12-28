/*
 * Submission: 1746510078
 * Problem: Sort Array By Parity (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 10:57:42 UTC
 * Runtime: 0 ms
 * Memory: 44.9 MB
 */

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            if (nums[l]%2 == 0) {
                l++;
                continue;
            }
            if (nums[r]%2 == 1) {
                r--;
                continue;
            }
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        } return nums;
    }
}