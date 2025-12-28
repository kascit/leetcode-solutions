/*
Submission: 1848309904
Status: Wrong Answer
Timestamp: 2025-12-06 12:37:35 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
  int max = Integer.MIN_VALUE;
  int[][] g;
    public int getMaximumGold(int[][] grid) {
        g = grid;
        // boolean[][] used = new boolean[g.length][g[0].length];
        for (int i = 0; i < g.length; i++) {
          for (int j = 0; j < g[0].length; j++) {
            boolean[][] used = new boolean[g.length][g[0].length];
            if (g[i][j] == 0) continue;
            // System.out.println(i+"jj"+j);
            bt(i,j,0,used);
            // for (int r = 0; r < used.length; r++) {
            //     Arrays.fill(used[r], false);
            // }
          }
        } return max;
    }

    void bt(int i , int j, int sum, boolean[][] vis) {
      // System.out.println(sum);
      if ( i < 0 || j < 0 || i >= g.length || j >= g[0].length || vis[i][j] || g[i][j] == 0) return;
      sum += g[i][j];
      max = Math.max(max,sum);
      vis[i][j] = true;
      bt(i+1,j,sum,vis);
      bt(i-1,j,sum,vis);
      bt(i,j+1,sum,vis);
      bt(i,j-1,sum,vis);
      vis[i][j] = false;

    }
}