/*
 * Submission: 1760820115
 * Problem: Form Smallest Number From Two Digit Arrays (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-05 19:00:11 UTC
 * Runtime: 0 ms
 * Memory: 41.7 MB
 */

class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int[] freq = new int[10];
        int mina = 9;
        for (int n : nums1) {
            freq[n]++;
            mina = Math.min(mina,n);
        }
        int min = 9;
        for (int n : nums2) {
            freq[n]++;
            min = Math.min(min,n);
        }
        for (int i = 1; i < 10; i++) {
            if (freq[i] == 2) return i;
        }
        
        return (mina<min) ? mina*10+min : min*10+mina;
    }
}