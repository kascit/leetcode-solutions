/*
Submission: 1858743896
Status: Accepted
Timestamp: 2025-12-18 08:30:23 UTC
Runtime: 124 ms
Memory: 145.7 MB
*/

class Solution {
  int[][][] memo;
  int[] p;

  public int maxProfit(int[] prices) {
    p = prices;
    int n = prices.length;
    memo = new int[n][2][3];
    for (int i = 0; i < n; i++)
      for (int j = 0; j < 2; j++)
        for (int k = 0; k <= 2; k++)
          memo[i][j][k] = -1;
    return ans(0, true, 0);
  }

  private int ans(int i, boolean action, int transactions) {
    if (transactions == 2 || i == p.length)
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