/*
 * Submission: 1710432107
 * Problem: Maximum Unique Subarray Sum After Deletion (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-25 03:58:54 UTC
 * Runtime: 1 ms
 * Memory: 42.4 MB
 */

class Solution {
    public int maxSum(int[] nums) {

        Arrays.sort(nums);
        int len = nums.length, prev = nums[len-1], sum = prev;
        for (int i = len - 2; i >=0 && nums[i] >= 0 ; i--){
            if (nums[i] != prev) sum+= nums[i];
            prev = nums[i];
        }        
        return sum;
    }
}