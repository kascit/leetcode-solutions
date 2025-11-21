/*
 * Submission: 1759482264
 * Problem: Points That Intersect With Cars (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-04 15:00:32 UTC
 * Runtime: 5 ms
 * Memory: 45 MB
 */

class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> s = new HashSet<>();
        for (List<Integer> n : nums) {
            for (int i = n.get(0); i <= n.get(1); i++) {
                s.add(i);
            }
        } return s.size();
    }
}