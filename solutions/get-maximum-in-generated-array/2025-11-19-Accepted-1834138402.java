/*
 * Submission: 1834138402
 * Problem: Get Maximum in Generated Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-19 10:55:19 UTC
 * Runtime: 0 ms
 * Memory: 42.3 MB
 */

class Solution {
    public int getMaximumGenerated(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] a = new int[n + 1];
        a[0] = 0;
        a[1] = 1;
        int max = 1;

        for (int i = 2; i <= n; i++) {
            if ((i & 1) == 0) a[i] = a[i / 2];
            else a[i] = a[i / 2] + a[i / 2 + 1];
            if (a[i] > max) max = a[i];
        }
        return max;
    }
}
