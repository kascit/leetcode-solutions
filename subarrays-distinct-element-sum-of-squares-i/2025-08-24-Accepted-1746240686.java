/*
 * Submission: 1746240686
 * Problem: Subarrays Distinct Element Sum of Squares I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 06:04:50 UTC
 * Runtime: 6 ms
 * Memory: 44.6 MB
 */

class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans = 0;
        int len = nums.size();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                set.add(nums.get(j));
                ans += Math.pow(set.size(),2);
            }
            set.clear();
        } return ans;
    }
}