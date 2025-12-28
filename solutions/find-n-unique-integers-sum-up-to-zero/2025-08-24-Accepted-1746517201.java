/*
 * Submission: 1746517201
 * Problem: Find N Unique Integers Sum up to Zero (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 11:05:26 UTC
 * Runtime: 0 ms
 * Memory: 42 MB
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