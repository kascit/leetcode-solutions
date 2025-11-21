/*
 * Submission: 1762352323
 * Problem: Find N Unique Integers Sum up to Zero (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 06:49:34 UTC
 * Runtime: 0 ms
 * Memory: 41.6 MB
 */

class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int cur = 1;
        for (int i = 0; i < n -1; i++) {
            if (i > 0 && i%2 == 0) cur++;
            ans[i] = (i%2 == 0) ? cur : cur*-1;
        } 
        if (n%2 == 0) {
            ans[n-1] = -1*cur;
        }
        return ans;
    }
}