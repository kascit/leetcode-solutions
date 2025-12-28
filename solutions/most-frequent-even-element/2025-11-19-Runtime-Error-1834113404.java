/*
 * Submission: 1834113404
 * Problem: Most Frequent Even Element (Easy)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-11-19 10:18:08 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int mostFrequentEven(int[] nums) {
        int[] freq = new int[1001];
        int max = -1;
        for (int n : nums) {
            if ((n&1) == 0) {
                max = Math.max(max,++freq[n/2]);
            }
        }
        if (max == -1) return -1;
        for (int i = 0; i < 1001; i++) {
            if (freq[i] == max) {
                return i*2;
            }
        } return -1;
    }
}