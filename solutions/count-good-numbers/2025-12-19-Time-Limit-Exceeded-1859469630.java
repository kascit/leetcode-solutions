/*
Submission: 1859469630
Status: Time Limit Exceeded
Timestamp: 2025-12-19 05:11:39 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
    public int countGoodNumbers(long n) {
      long ans = 5;
      int MOD = (int) 1e9 + 7;
        for (int i = 1; i < n; i++) {
          if (i % 2 == 1) ans = (ans * 4) % MOD;
          else ans = (ans * 5) % MOD;
        }
        return (int) ans;
    }

}