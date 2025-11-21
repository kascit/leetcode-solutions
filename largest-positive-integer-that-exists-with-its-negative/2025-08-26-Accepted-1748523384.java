/*
 * Submission: 1748523384
 * Problem: Largest Positive Integer That Exists With Its Negative (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-26 04:37:14 UTC
 * Runtime: 6 ms
 * Memory: 45.3 MB
 */

class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int max = -1;
        for (int n : nums){
            if (s.contains(-1*n)) {
                n = (n > 0) ? n : -1*n;
                max = Math.max(max,n);
            }
            s.add(n);
        } return max;
    }
}