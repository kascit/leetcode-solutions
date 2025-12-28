/*
Submission: 1858748002
Status: Accepted
Timestamp: 2025-12-18 08:36:36 UTC
Runtime: 8 ms
Memory: 45.4 MB
*/

class Solution {
  int[][][] memo;
  int[] p;
  int t;
  public int maxProfit(int t, int[] prices) {
    p = prices;
    this.t = t;
    int n = prices.length;
    memo = new int[n][2][t+1];
    for (int i = 0; i < n; i++)
      for (int j = 0; j < 2; j++)
        for (int k = 0; k <= t; k++)
          memo[i][j][k] = -1;
    return ans(0, true, 0);
  }

  private int ans(int i, boolean action, int transactions) {
    if (transactions == this.t || i == p.length)
      return 0;
    int j = (action == true) ? 1 : 0;
    if (memo[i][j][transactions] != -1)
      return memo[i][j][transactions];

    int buy, sell, skip;
    buy = sell = skip = Integer.MIN_VALUE;
    if (action) {
      buy = -p[i] + ans(i + 1, false, transactions);
    } else {
      sell = p[i] + ans(i + 1, true, transactions + 1);
    }
    skip = ans(i + 1, action, transactions);

    return memo[i][j][transactions] = Math.max(buy, Math.max(sell, skip));
  }
}