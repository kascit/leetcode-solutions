/*
Submission: 1850190299
Status: Accepted
Timestamp: 2025-12-08 13:53:05 UTC
Runtime: 13 ms
Memory: 42 MB
*/

class Solution {
    public int countTriples(int n) {
        int ans = 0;
        for (int a = 1; a < n; a++) {
            for (int b = 1; b < n; b++) {
                int x = a * a + b * b;
                int c = (int) Math.sqrt(x);
                if (c <= n && c * c == x) {
                    ans++;
                }
            }
        }
        return ans;
    }
}