/*
 * Submission: 1754977901
 * Problem: Contains Duplicate II (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-31 16:37:41 UTC
 * Runtime: 19 ms
 * Memory: 59.6 MB
 */

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i <= Math.min(k,len-1); i++) {
            if (!s.add(nums[i])) return true;
        }
        for (int i = k+1; i < len; i++) {
            s.remove(nums[i-k-1]);
            if (!s.add(nums[i])) return true;
        } return false;
    }
}