/*
 * Submission: 1748543938
 * Problem: Find the Peaks (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-26 04:56:27 UTC
 * Runtime: 1 ms
 * Memory: 44.3 MB
 */

class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> ans = new ArrayList<>();
        int len = mountain.length;
        for (int i = 1; i < len - 1; i++) {
            if (mountain[i] > mountain[i-1] && mountain[i] > mountain[i+1]) {
                ans.add(i);
            }
        } return ans;
    }
}