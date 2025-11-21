/*
 * Submission: 1716709021
 * Problem: Find the Number of Good Pairs I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-30 06:21:16 UTC
 * Runtime: 1 ms
 * Memory: 42.7 MB
 */

class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;
        for (int i : nums2){
            for (int j : nums1){
                count += (j%(i*k) == 0) ? 1 : 0;
            }
        }
        return count;
    }
}