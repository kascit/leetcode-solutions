/*
 * Submission: 1598692500
 * Problem: Two Sum (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-06 16:17:31 UTC
 * Runtime: 3 ms
 * Memory: 44.9 MB
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[] {numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[] {};
    }
}
