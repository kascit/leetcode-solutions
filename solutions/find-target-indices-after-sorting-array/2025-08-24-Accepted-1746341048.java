/*
 * Submission: 1746341048
 * Problem: Find Target Indices After Sorting Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 07:44:43 UTC
 * Runtime: 0 ms
 * Memory: 43.5 MB
 */

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int less = 0;
        int count = 0;
        for (int n : nums) {
            if (n < target) {
                less++;
            } else if (n == target) {
                count++;
            }
        }
        List<Integer> ans = new ArrayList<>(count);
        while (count-->0) {
            ans.add(less++);
        } return ans;
    }
}