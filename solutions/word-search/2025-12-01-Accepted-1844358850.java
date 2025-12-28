/*
Submission: 1844358850
Status: Accepted
Timestamp: 2025-12-01 17:35:57 UTC
Runtime: 84 ms
Memory: 42.8 MB
*/

class Solution {
  String w;
  char[][] b;

  public boolean exist(char[][] board, String word) {
    this.w = word;
    this.b = board;
    int m = board.length;
    int n = board[0].length;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (board[i][j] == w.charAt(0)) {
          boolean[][] vis = new boolean[m][n];
          if (bt(i, j, vis, 1)) return true;
        }
      }
    } return false;
  }

  boolean bt(int i, int j, boolean[][] vis,int idx) {
    // if (i == b.length || j == b[0].length || idx > w.length()) return false;
    if (w.length() == idx) return true;
    // boolean l, r, u, d;
    // l = r = u = d = false;
    vis[i][j] = true;
    if (i > 0 && !vis[i-1][j] && b[i-1][j] == w.charAt(idx)) {
      if (bt(i-1,j,vis,idx+1)) return true;
    }
    if (j > 0 && !vis[i][j-1] && b[i][j-1] == w.charAt(idx)) {
      if (bt(i,j-1,vis,idx+1)) return true;
    }
    if (i < b.length-1 && !vis[i+1][j] && b[i+1][j] == w.charAt(idx)) {
      if (bt(i+1,j,vis,idx+1)) return true;
    }
    if (j < b[0].length-1 && !vis[i][j+1] && b[i][j+1] == w.charAt(idx)) {
      if (bt(i,j+1,vis,idx+1)) return true;
    }
    vis[i][j] = false;
    return false;
  }
}