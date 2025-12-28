/*
 * Submission: 1760819015
 * Problem: Form Smallest Number From Two Digit Arrays (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-05 18:58:59 UTC
 * Runtime: N/A
 * Memory: N/A
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
            if (freq[n] == 1) return n;
            min = Math.min(min,n);
        }
        
        return (mina<min) ? mina*10+min : min*10+mina;
    }
}