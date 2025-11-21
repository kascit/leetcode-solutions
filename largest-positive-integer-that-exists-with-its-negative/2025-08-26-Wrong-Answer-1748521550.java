/*
 * Submission: 1748521550
 * Problem: Largest Positive Integer That Exists With Its Negative (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-26 04:35:25 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int max = -1;
        for (int n : nums){
            if ( n < 0) n *= -1;
            if (s.contains(n)) {
                max = Math.max(max,n);
            }
            s.add(n);
        } return max;
    }
}