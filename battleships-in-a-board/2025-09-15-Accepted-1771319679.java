/*
 * Submission: 1771319679
 * Problem: Battleships in a Board (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-15 07:36:37 UTC
 * Runtime: 0 ms
 * Memory: 45.5 MB
 */

class Solution {
    public int countBattleships(char[][] board) {
        int rows = board.length, cols = board[0].length, ans = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'X' && (i == 0 || board[i-1][j] == '.') && (j == 0 || board[i][j-1] == '.'))
                ans++;
            }
        } return ans;
    }
}