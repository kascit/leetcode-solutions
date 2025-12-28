/*
 * Submission: 1602543743
 * Problem: Product of Array Except Self (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-10 09:49:10 UTC
 * Runtime: 2 ms
 * Memory: 58 MB
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeros = 0, prod = 1;
        for ( int i = 0; i < nums.length; i++ ){
            if ( nums[i] == 0 ) zeros++;
            else prod *= nums[i];
        }
        if (zeros > 1) {Arrays.fill(nums,0); return nums;};
        for (int i = 0; i < nums.length; i++){
            if (zeros == 1){
                nums[i] = (nums[i] == 0) ? prod : 0;
            } else nums[i] = prod/nums[i];
        }
        return nums;
    }
}