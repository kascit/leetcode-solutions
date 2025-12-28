/*
 * Submission: 1759282416
 * Problem: Two Furthest Houses With Different Colors (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-04 11:13:46 UTC
 * Runtime: 1 ms
 * Memory: 42.1 MB
 */

class Solution {
    public int maxDistance(int[] colors) {
        int ans = 0, len = colors.length;
        for(int i = 0; i < len - 1; i++) {
            int j = len - 1;
            for(; j > i && colors[j] == colors[i]; j--);
            ans = Math.max(ans,j-i);
        } return ans;
    }
}