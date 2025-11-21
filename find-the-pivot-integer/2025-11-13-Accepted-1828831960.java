/*
 * Submission: 1828831960
 * Problem: Find the Pivot Integer (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-13 15:19:09 UTC
 * Runtime: 1 ms
 * Memory: 42.4 MB
 */

class Solution {
    public int pivotInteger(int n) {
        if (n == 1) return 1;
        for(int i = 1; i < n; i++){
            if ((i*(i+1)/2) == (n*(n+1)/2) - (i*(i+1)/2) + i) return i;
        } return -1;
    }
}