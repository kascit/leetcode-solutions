/*
Submission: 1860488742
Status: Accepted
Timestamp: 2025-12-20 10:24:57 UTC
Runtime: 0 ms
Memory: 42.3 MB
*/

class Solution {
  int MOD = (int) 1e9 + 7;
    public int countGoodNumbers(long n) {
        long evens = (n+1)/2;
        long odds = (n)/2;
        long ans = (pow(5,evens) * pow(4,odds)) % MOD;
        return (int) ans % MOD;
    }

    long pow(int n, long times) {
      if (times == 0) return 1;
      if (times == 1) return n;
      long half = pow(n,times/2) % MOD;
      long ans = half * half % MOD;
      if (times % 2 == 1) {
        ans = (ans * n) % MOD;
      }
      return ans;
    }
}