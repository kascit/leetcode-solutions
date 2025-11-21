/*
 * Submission: 1832163097
 * Problem: Number of Distinct Averages (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-17 09:43:03 UTC
 * Runtime: 3 ms
 * Memory: 43.1 MB
 */

class Solution {
    public int distinctAverages(int[] nums) {
        HashSet<Double> s = new HashSet<>();
        Arrays.sort(nums);
        int l = 0, r = nums.length - 1;
        while (l < r) {
            s.add((nums[l++]+nums[r--])/2.0);
        } return s.size();
    }
}