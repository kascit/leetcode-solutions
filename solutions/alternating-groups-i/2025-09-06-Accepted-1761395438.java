/*
 * Submission: 1761395438
 * Problem: Alternating Groups I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 11:11:41 UTC
 * Runtime: 1 ms
 * Memory: 43.6 MB
 */

class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int len = colors.length, ans = 0;
        for (int i = 0; i < len; i++) {
            if (colors[i] != colors[(len+i-1)%len] && colors[i] != colors[(i+1)%len]) ans++;
        } return ans;
    }
}