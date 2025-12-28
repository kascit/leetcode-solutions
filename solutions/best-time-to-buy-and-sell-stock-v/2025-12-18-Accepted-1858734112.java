/*
Submission: 1858734112
Status: Accepted
Timestamp: 2025-12-18 08:15:27 UTC
Runtime: 763 ms
Memory: 291.2 MB
*/

class Solution {
  long[][][][] memo;
  int[] p;
    public long maximumProfit(int[] prices, int t) {
      int n = prices.length;
      p = prices;
      memo = new long[n][t*2+1][2][2];
        for (int i = 0; i < n; i++) {
          for (int j = 0; j < t*2+1; j++) {
            for (int k = 0; k < 2; k++) {
              for (int l = 0; l < 2; l++) {
                memo[i][j][k][l] = -1;
              }
            }
          }
        }
        return ans(0,true,true,0,t);
    }

    private long ans(int i, boolean canB, boolean canS, int buySells, int transactions) {
      if (buySells == transactions * 2) {
        return 0;
      }
      if (i == p.length) {
        return (buySells % 2 == 0) ? 0 : (long) -1e17;
      }
      if (!canS && !canB) {
        canS = true;
        canB = true;
      }
      int cs = (canS == true) ? 1 : 0;
      int cb = (canB == true) ? 1 : 0;
      if (memo[i][buySells][cs][cb] != -1) {
        return memo[i][buySells][cs][cb];
      }

      long buy, sell, skip;
      buy = sell = skip = Long.MIN_VALUE;
      if (canS) {
        sell = p[i] + ans(i+1,canB,false,buySells+1,transactions);
      }
      if (canB) {
        buy = -p[i] + ans(i+1,false,canS,buySells+1,transactions);
      }
      skip = ans(i+1,canB,canS,buySells,transactions);

      return memo[i][buySells][cs][cb] = Math.max(sell,Math.max(buy,skip));
    }
}