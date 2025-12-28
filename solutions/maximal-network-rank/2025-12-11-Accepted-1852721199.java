/*
Submission: 1852721199
Status: Accepted
Timestamp: 2025-12-11 08:17:31 UTC
Runtime: 4 ms
Memory: 47.1 MB
*/

class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
      int[] indeg = new int[n+1];
      int[][] connected = new int[n+1][n+1];
        for (int[] r : roads) {
          int from = r[0];
          int to = r[1];
          indeg[to]++;
          indeg[from]++;
          connected[to][from] = 1;
          connected[from][to] = 1;
        }
        int max = 0;
        for (int i = 0; i < n + 1; i++) {
          for (int j = i + 1; j < n + 1; j++) {
            int cur = indeg[i]+indeg[j];
            cur -= connected[i][j];
            max = Math.max(cur,max);
          }
        } return max;
    }
}