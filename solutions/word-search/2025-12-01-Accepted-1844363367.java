/*
Submission: 1844363367
Status: Accepted
Timestamp: 2025-12-01 17:40:42 UTC
Runtime: 142 ms
Memory: 42.7 MB
*/

class Solution {
    char[][] b;
    String w;
    int m, n;

    public boolean exist(char[][] board, String word) {
        this.b = board;
        this.w = word;
        m = board.length;
        n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(i, j, 0)) return true;
                }
            }
        }
        return false;
    }

    boolean dfs(int i, int j, int idx) {
        if (idx == w.length()) return true;
        if (i < 0 || j < 0 || i >= m || j >= n) return false;
        if (b[i][j] != w.charAt(idx)) return false;

        char temp = b[i][j];
        b[i][j] = '#'; 

        boolean found =
            dfs(i+1, j, idx+1) ||
            dfs(i-1, j, idx+1) ||
            dfs(i, j+1, idx+1) ||
            dfs(i, j-1, idx+1);

        b[i][j] = temp;
        return found;
    }
}
