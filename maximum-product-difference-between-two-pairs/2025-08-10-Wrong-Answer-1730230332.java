/*
 * Submission: 1730230332
 * Problem: Maximum Product Difference Between Two Pairs (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-10 14:53:23 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int maxProductDifference(int[] nums) {
        int  maxy = 1, miny = 1;
        for(int i = 0; i < 2; i++){
            int max = 0, min = 0;
            for (int j = 0; j < nums.length; j++){
                if (nums[j] == -1) continue;
                if (nums[j] > nums[max]) max = j;
                if (nums[j] < nums[min]) min = j;
            }
            maxy *= nums[max];
            miny *= nums[min];
            nums[max] = -1;
            nums[min] = -1;
        } return maxy - miny;
    }
}