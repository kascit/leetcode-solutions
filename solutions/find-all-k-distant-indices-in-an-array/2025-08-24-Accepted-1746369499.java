/*
 * Submission: 1746369499
 * Problem: Find All K-Distant Indices in an Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 08:18:16 UTC
 * Runtime: 2 ms
 * Memory: 44.7 MB
 */

class Solution {

    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> res = new ArrayList<>();
        int r = 0; 
        int n = nums.length;
        for (int j = 0; j < n; ++j) {
            if (nums[j] == key) {
                int l = Math.max(r, j - k);
                r = Math.min(n - 1, j + k) + 1;
                for (int i = l; i < r; ++i) {
                    res.add(i);
                }
            }
        }
        return res;
    }
}