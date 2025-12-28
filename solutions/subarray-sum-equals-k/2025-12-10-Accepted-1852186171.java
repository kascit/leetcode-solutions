/*
Submission: 1852186171
Status: Accepted
Timestamp: 2025-12-10 16:32:40 UTC
Runtime: 21 ms
Memory: 49.2 MB
*/

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int ans = 0, cur = 0;
        map.put(0,1);
        for (int n : nums) {
          cur += n;
          int need = cur - k;
          ans += map.getOrDefault(need,0);
          map.merge(cur,1,Integer::sum);
        } return ans;
    }
}