/*
 * Submission: 1760839755
 * Problem: Available Captures for Rook (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-05 19:23:39 UTC
 * Runtime: 0 ms
 * Memory: 40.9 MB
 */

class Solution {
    int ans = 0;
    char[][] b;
    public int numRookCaptures(char[][] board) {
        this.b = board;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    dost(i,j,true,true,true,true);
                }
            }
        }
        return ans;
    }
    private void dost(int i, int j, boolean up, boolean down, boolean left, boolean right) {
        if (i < 0 || i > 7 || j < 0 || j > 7 || b[i][j] == 'B') return;
        if (b[i][j] == 'p') {
            ans++;
            return;
        }
        if (up) dost(i+1,j,true,false,false,false);
        if (right) dost(i,j+1,false,false,false,true);
        if (left) dost(i,j-1,false,false,true,false);
        if (down) dost(i-1,j,false,true,false,false);
    }
}