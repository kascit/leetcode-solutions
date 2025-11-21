/*
 * Submission: 1759126952
 * Problem: Minimum Operations to Make Array Values Equal to K (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-04 08:09:09 UTC
 * Runtime: 2 ms
 * Memory: 44.8 MB
 */

class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> sss = new HashSet<>();
        for (int n : nums) {
            if (n < k) return -1;
            else if (n > k) sss.add(n);
        } return sss.size();
    }
}