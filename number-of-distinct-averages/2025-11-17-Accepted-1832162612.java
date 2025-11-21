/*
 * Submission: 1832162612
 * Problem: Number of Distinct Averages (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-17 09:42:18 UTC
 * Runtime: 3 ms
 * Memory: 42.9 MB
 */

class Solution {
    public int distinctAverages(int[] nums) {
        Set<Double> s = new HashSet<>();
        Arrays.sort(nums);
        int l = 0, r = nums.length - 1;
        while (l < r) {
            s.add((nums[l++]+nums[r--])/2.0);
        } return s.size();
    }
}