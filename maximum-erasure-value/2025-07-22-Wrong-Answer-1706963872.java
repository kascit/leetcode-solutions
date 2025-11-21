/*
 * Submission: 1706963872
 * Problem: Maximum Erasure Value (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-07-22 08:25:08 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int l = 0, r = 0, len = nums.length, sum = 0, max = 0;
        Set<Integer> s = new HashSet<>();
        while(r < len){
            while(r < len && !s.contains(nums[r])){
                sum += nums[r];
                s.add(nums[r]);
                r++;                
            }
            while(l < len && r < len && s.contains(nums[r])){
                sum -= nums[l];
                s.remove(nums[l]);
                l++;
            }
            max = Math.max(sum,max);
        }

        return max;
    }
}