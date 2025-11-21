/*
 * Submission: 1763953248
 * Problem: Find the Number of Winning Players (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-08 15:46:57 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        Arrays.sort(pick,(a,b) -> a[1] - b[1]);
        int[] picked = new int[n];
        int[] pickWhat = new int[n];
        for (int[] prick : pick) {
            int player = prick[0];
            int ball = prick[1];
            if (pickWhat[player] == ball) {
                picked[player]++;
            } else {
                pickWhat[player] = ball;
                picked[player] = 1;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (i + 1 <= picked[i]) ans++;
        } return ans;
    }
}