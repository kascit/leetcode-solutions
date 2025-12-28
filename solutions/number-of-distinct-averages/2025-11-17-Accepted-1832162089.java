/*
 * Submission: 1832162089
 * Problem: Number of Distinct Averages (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-17 09:41:31 UTC
 * Runtime: 3 ms
 * Memory: 43.2 MB
 */

class Solution {
    public int distinctAverages(int[] nums) {
        Set<Double> s = new HashSet<>();
        Arrays.sort(nums);
        int l = 0, r = nums.length - 1;
        while (l < r) {
            s.add((0D+nums[l++]+nums[r--])/2);
        } return s.size();
    }
}