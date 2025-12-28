/*
 * Submission: 1746515871
 * Problem: Find N Unique Integers Sum up to Zero (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-24 11:03:59 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int cur = 1;
        for (int i = 0; i < n -1; i++) {
            if (i > 0 && i%2 == 0) cur++;
            ans[i] = (i%2 == 0) ? cur : cur*-1;
        } return ans;
    }
}