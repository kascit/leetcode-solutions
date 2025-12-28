/*
Submission: 1845108730
Status: Accepted
Timestamp: 2025-12-02 14:56:42 UTC
Runtime: 13 ms
Memory: 74.1 MB
*/

class Solution {
  int MOD = (int) 1e9 + 7;

  public int sumDistance(int[] nums, String s, int d) {

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
      ans = (ans + (long) pos[i] * i - prefix) % MOD;
      prefix = (prefix + pos[i]) % MOD;
    }

    return (int) ans;
  }
}