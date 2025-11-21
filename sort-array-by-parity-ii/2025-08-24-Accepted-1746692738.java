/*
 * Submission: 1746692738
 * Problem: Sort Array By Parity II (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 14:12:22 UTC
 * Runtime: 4 ms
 * Memory: 47.6 MB
 */

class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int l = 0, r = 0;
        int len = nums.length;
        for(int i = 0; i < len; i++) {
            while(l < len && nums[l]%2 == 1) {
                l++;
            }
            while(r < len && nums[r]%2 == 0) {
                r++;
            }
            if (l == len || r == len) break;
            if (i%2 == 0) {
                int temp = nums[i];
                nums[i] = nums[l];
                nums[l] = temp;  
                l++;
            } else {
                int temp = nums[i];
                nums[i] = nums[r];
                nums[r] = temp;  
                r++;
            }
        } return nums;
    }
}