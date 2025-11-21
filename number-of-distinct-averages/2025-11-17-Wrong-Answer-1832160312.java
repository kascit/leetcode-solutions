/*
 * Submission: 1832160312
 * Problem: Number of Distinct Averages (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-11-17 09:38:43 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int distinctAverages(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int n : nums) {
            s.add(n);
        } return s.size()/2;
    }
}