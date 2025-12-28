/*
 * Submission: 1832162994
 * Problem: Number of Distinct Averages (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-17 09:42:53 UTC
 * Runtime: 4 ms
 * Memory: 42.6 MB
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