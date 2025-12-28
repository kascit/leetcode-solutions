/*
Submission: 1845096495
Status: Wrong Answer
Timestamp: 2025-12-02 14:41:09 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
  int MOD = (int) 1e9 + 7;
    public int sumDistance(int[] nums, String s, int d) {
        d %= MOD;
        for (int i = 0; i< nums.length; i++) {
          if (s.charAt(i) == 'L') {
            nums[i] = (nums[i] - d) % MOD;
          } else {
            nums[i] = (nums[i] + d) % MOD;
          }
        }
        Arrays.sort(nums);
        long n = nums.length;

        long prefix = 0;
        long ans = 0;

        for (int i = 0; i < n; i++) {
            ans = (ans + (long)nums[i] * i - prefix) % MOD;
            prefix = (prefix + nums[i]) % MOD;
        }
        return (int) ans % MOD;
    }
}