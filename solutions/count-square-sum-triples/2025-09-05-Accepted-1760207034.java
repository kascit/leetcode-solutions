/*
 * Submission: 1760207034
 * Problem: Count Square Sum Triples (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-05 07:34:53 UTC
 * Runtime: 44 ms
 * Memory: 40.9 MB
 */

class Solution {
    public int countTriples(int n) {
        int ans = 0;
        for(int i = 1; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k <= n; k++) {
                    if (i*i + j *j == k*k) ans++;
                }
            }
        } return ans*2;
    }
}