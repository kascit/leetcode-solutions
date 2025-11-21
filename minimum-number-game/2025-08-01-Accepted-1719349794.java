/*
 * Submission: 1719349794
 * Problem: Minimum Number Game (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-01 09:47:11 UTC
 * Runtime: 2 ms
 * Memory: 45.1 MB
 */

class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len - 1; i+=2){
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp; 
        }
        return nums;
    }
}