/*
Submission: 1857842745
Status: Accepted
Timestamp: 2025-12-17 08:10:23 UTC
Runtime: 2 ms
Memory: 84.2 MB
*/

class Solution {
    public long getDescentPeriods(int[] prices) {
        long ans = 0;
        int l = 0, r = 1, n = prices.length;
        while (r < n) {
          while (r < n && (prices[r] + 1 == prices[r-1] )) r++;
          // System.out.println(l + "   " + r);
          long len = r - l;
          ans += (len) * (len + 1) / 2;
          l = r;
          r++;
        } return ans + ((n < 2 || prices[n-1] + 1 != prices[n-2]) ? 1 : 0);
    }
}