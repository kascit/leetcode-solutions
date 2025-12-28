/*
 * Submission: 1834115606
 * Problem: Most Frequent Even Element (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-19 10:21:29 UTC
 * Runtime: 5 ms
 * Memory: 47.8 MB
 */

class Solution {
    public int mostFrequentEven(int[] nums) {
        int len = 0;
        for (int n : nums) {
            len = Math.max(n,len);
        }
        int[] freq = new int[len+1];
        int max = -1;
        for (int n : nums) {
            if ((n&1) == 0) {
                max = Math.max(max,++freq[n/2]);
            }
        }
        if (max == -1) return -1;
        for (int i = 0; i < len+1; i++) {
            if (freq[i] == max) {
                return i*2;
            }
        } return -1;
    }
}