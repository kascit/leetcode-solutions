/*
 * Submission: 1706100038
 * Problem: Count Pairs Whose Sum is Less than Target (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 15:16:54 UTC
 * Runtime: 3 ms
 * Memory: 42.4 MB
 */

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int l = 0;
        int r = nums.size() - 1;
        int count = 0;

        while (l < r) {
            if (nums.get(l) + nums.get(r) < target) {
                count += (r - l);
                l++;
            } else {
                r--;
            }
        }
        return count;
    }
}