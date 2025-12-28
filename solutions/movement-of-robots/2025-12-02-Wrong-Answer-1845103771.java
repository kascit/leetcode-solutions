/*
Submission: 1845103771
Status: Wrong Answer
Timestamp: 2025-12-02 14:50:24 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
  int MOD = (int) 1e9 + 7;

  public int sumDistance(int[] nums, String s, int d) {
    d %= MOD;
    int n = nums.length;
    long[] pos = new long[n];
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'L') pos[i] = (long)nums[i] - d;
            else pos[i] = (long)nums[i] + d;
        }
    Arrays.sort(pos);
    

    long prefix = 0;
    long ans = 0;

    for (int i = 0; i < n; i++) {
      ans = (ans + (long) pos[i] * i - prefix);
      prefix += pos[i];
    }
    ans %= MOD;

    return (int) ans % MOD;
  }
}