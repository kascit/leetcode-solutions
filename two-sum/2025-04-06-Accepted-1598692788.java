/*
 * Submission: 1598692788
 * Problem: Two Sum (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-06 16:17:51 UTC
 * Runtime: 2 ms
 * Memory: 45.2 MB
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> seen = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int cur = nums[i];
            int diff = target - cur;
            if(seen.containsKey(diff)) return new int[]{seen.get(diff),i};
            seen.put(cur,i);
        }
        return new int[]{};
    }
}