/*
Submission: 1845115078
Status: Accepted
Timestamp: 2025-12-02 15:04:41 UTC
Runtime: 1 ms
Memory: 66 MB
*/

class Solution {
    public int minImpossibleOR(int[] nums) {
      int or = 0;
      for (int n : nums) if ((n & (n-1)) == 0) or |= n;
      int n = Integer.MAX_VALUE ^ or;
      return n & -n;
    }
}