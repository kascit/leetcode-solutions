/*
 * Submission: 1603972953
 * Problem: Max Number of K-Sum Pairs (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-11 19:40:11 UTC
 * Runtime: 18 ms
 * Memory: 57.7 MB
 */

class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1, count = 0;
        while (left < right){
            int sum = nums[left] + nums[right];
            if (sum == k) {
                left++;right--;count++;
            } else if (sum > k){
                right--;
            } else left++;
        }
        return count;
    }
}