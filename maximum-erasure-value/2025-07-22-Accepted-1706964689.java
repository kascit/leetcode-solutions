/*
 * Submission: 1706964689
 * Problem: Maximum Erasure Value (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-22 08:26:04 UTC
 * Runtime: 56 ms
 * Memory: 57.4 MB
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
            max = Math.max(sum,max);
            while(l < len && r < len && s.contains(nums[r])){
                sum -= nums[l];
                s.remove(nums[l]);
                l++;
            }
        }

        return max;
    }
}