/*
Submission: 1844767722
Status: Wrong Answer
Timestamp: 2025-12-02 06:30:18 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
  // Map<Integer, Integer> memo = new HashMap<>();
  int mod = (int) 1e9 + 7;

  public int countTrapezoids(int[][] points) {
    Map<Integer, Integer> yCount = new HashMap<>();
    for (int[] p : points) {
      yCount.merge(p[1], 1, Integer::sum);
    }
    int[] nums = new int[yCount.size()];
    int idx = 0;
    for (int val : yCount.values()) {
      nums[idx++] = (int) (nCr(val) % mod);
    }
    int sum = 0;
    int ans = 0;
    for (int n : nums) {
      // System.out.println(n);
      sum = (sum + n) % mod;
    }
    // System.out.println(sum);

    for (int n : nums) {
      sum -= n;
      ans = (ans + (n * sum)) % mod;
    }

    // a * b + b * c + a * c
    // a+c)b+a*c)
    return (int) ans;
  }

  private long nCr(int r) {
    return 1L * r * (r - 1) / 2;
  }

  // int doShit(int val) {

  //   long res = 1;

  //   for (int i = 0; i < 2; i++) {
  //     res *= (val - i) % mod;
  //     res /= (i + 1);
  //   }
  //   res %= mod;

  //   memo.put(val, (int) res);
  //   return (int) res;
  // }

}