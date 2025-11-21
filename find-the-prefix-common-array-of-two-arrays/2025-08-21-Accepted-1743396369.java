/*
 * Submission: 1743396369
 * Problem: Find the Prefix Common Array of Two Arrays (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-21 16:03:18 UTC
 * Runtime: 3 ms
 * Memory: 45.6 MB
 */

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int len = A.length;
        int[] freq = new int[len+1];
        for (int i = 0; i < len; i++) {
            freq[A[i]]++;
            freq[B[i]]++;
            A[i] = 0;
            for (int j = 0; j < len+1; j++) {
                A[i] += freq[j]/2;
            }
        }
        return A;
    }
}