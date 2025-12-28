/*
Submission: 1852163462
Status: Time Limit Exceeded
Timestamp: 2025-12-10 16:07:54 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int n : nums) s.add(n);
        int max = 0;
        for (int n : nums) {
          if (!s.contains(n-1)) {
            int run = 1;
            while (s.contains(n+run)) run++;
            max = Math.max(max,run);
          }
        } return max;
    }
}