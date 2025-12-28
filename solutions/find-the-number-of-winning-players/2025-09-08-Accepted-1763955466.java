/*
 * Submission: 1763955466
 * Problem: Find the Number of Winning Players (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-08 15:48:55 UTC
 * Runtime: 8 ms
 * Memory: 45 MB
 */

class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        Arrays.sort(pick,(a,b) -> a[1] - b[1]);
        int[] picked = new int[n];
        int[] pickWhat = new int[n];
        int[] maxP = new int[n];
        for (int[] prick : pick) {
            int player = prick[0];
            int ball = prick[1];
            if (pickWhat[player] == ball) {
                picked[player]++;
            } else {
                pickWhat[player] = ball;
                picked[player] = 1;
            }
            if (picked[player] > maxP[player]) {
                maxP[player] = picked[player];
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (i + 1 <= maxP[i]) ans++;
        } return ans;
    }
}