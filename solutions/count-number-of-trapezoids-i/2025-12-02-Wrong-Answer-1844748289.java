/*
Submission: 1844748289
Status: Wrong Answer
Timestamp: 2025-12-02 06:06:09 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
  Map<Integer,Integer> memo = new HashMap<>();
  int mod = (int) 1e9 + 7;
  public int countTrapezoids(int[][] points) {
    Map<Integer, Integer> yCount = new HashMap<>();
    for (int[] p : points) {
      yCount.merge(p[1], 1, Integer::sum);
    }
    int[] nums = new int[yCount.size()];
    int idx = 0;
    for (int val : yCount.values()) {
      nums[idx++] = doShit(val) % mod;
    }
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        sum += nums[i]*nums[j] % mod;
      }
    }

    // a * b + b * c + a * c
    // a+c)b+a*c)
    return sum;
  }

  int doShit(int val) {
    if (memo.containsKey(val)) {
      return memo.get(val);
    }

    int res = 1;

    for(int i = 0; i<2; i++){
        res *= (val - i);
        res /= (i + 1);
    }

    memo.put(val, res);
    return res;
  }

}