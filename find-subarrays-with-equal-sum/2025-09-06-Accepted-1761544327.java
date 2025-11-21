/*
 * Submission: 1761544327
 * Problem: Find Subarrays With Equal Sum (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 14:13:24 UTC
 * Runtime: 1 ms
 * Memory: 42.5 MB
 */

class Solution {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            if (!set.add(nums[i]+nums[i+1])) return true;
        } return false;
    }
}