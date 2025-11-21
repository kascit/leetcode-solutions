/*
 * Submission: 1725151490
 * Problem: Find the Pivot Integer (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-06 04:18:12 UTC
 * Runtime: 1 ms
 * Memory: 41 MB
 */

class Solution {
    public int pivotInteger(int n) {
        if (n == 1) return 1;
        for(int i = 1; i < n; i++){
            if ((i*(i+1)/2) == (n*(n+1)/2) - (i*(i+1)/2) + i) return i;
        } return -1;
    }
}