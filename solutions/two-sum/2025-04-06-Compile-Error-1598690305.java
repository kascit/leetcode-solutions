/*
 * Submission: 1598690305
 * Problem: Two Sum (Easy)
 * Status: Compile Error
 * Language: java
 * Timestamp: 2025-04-06 16:15:05 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer,Integer>() seen = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            int cur = nums[i];
            int diff = target - cur;
            if(seen.containsKey(diff)) return new int[]{seen.get(diff),i};
            seen.put(cur,i);
        }
        return new int[];
    }
}