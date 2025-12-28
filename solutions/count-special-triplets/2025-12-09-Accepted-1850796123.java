/*
Submission: 1850796123
Status: Accepted
Timestamp: 2025-12-09 06:16:34 UTC
Runtime: 258 ms
Memory: 188.6 MB
*/

class Solution {
  public int specialTriplets(int[] nums) {
    Map<Integer, Long> pref = new HashMap<>();
    Map<Integer, Long> suf = new HashMap<>();
    for (int n : nums)
      suf.merge(n, 1L, Long::sum);

    // for(Map.Entry<Long,Long> e : suf.entrySet()) {
    //   System.out.println(e.getKey() +" " + e.getValue());
    // }

    long ans = 0;
    int MOD = 1_000_000_007;
    for (int i = 0; i < nums.length; i++) {
      int n = nums[i];
      suf.merge(n, -1L, Long::sum);
      long prev = pref.getOrDefault(n * 2, 0L);
      long next = suf.getOrDefault(n * 2, 0L);
      ans = (ans + prev*next) % MOD;
      // System.out.println(i+" " + " ans: " + ans + " n: " + nums[i]);
      pref.merge(n, 1L, Long::sum);
    }
    return (int) ans;
  }
}