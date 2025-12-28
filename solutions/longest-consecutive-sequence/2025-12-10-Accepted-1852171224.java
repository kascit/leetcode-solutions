/*
Submission: 1852171224
Status: Accepted
Timestamp: 2025-12-10 16:16:34 UTC
Runtime: 30 ms
Memory: 95.9 MB
*/

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>(nums.length);
        for (int n : nums) s.add(n);
        int max = 0;
        for (int n : s) {
          if (!s.contains(n-1)) {
            int run = 1;
            while (s.contains(n+run)) run++;
            max = Math.max(max,run);
          }
        } return max;
    }
}