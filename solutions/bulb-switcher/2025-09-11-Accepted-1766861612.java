/*
 * Submission: 1766861612
 * Problem: Bulb Switcher (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-11 06:42:19 UTC
 * Runtime: 0 ms
 * Memory: 40.4 MB
 */

class Solution {
    public int bulbSwitch(int n) {
        int ans = 0;

        for (int i=1; i*i <= n; i++) {
            ans++;
        } return ans;
    }
}