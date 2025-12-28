/*
Submission: 1837771138
Status: Accepted
Timestamp: 2025-11-23 15:39:18 UTC
Runtime: 24 ms
Memory: 65.7 MB
*/

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        m.put(0,-1);
        int prev = 0, ans = 0, n = nums.length;
        for (int i = 0; i<n; i++) {
            nums[i] = prev + ((nums[i] == 0) ? -1 : 1);
            prev = nums[i];
            if(m.containsKey(prev)) {
                ans = Math.max(ans,i-m.get(prev));
            }
            else m.put(prev,i);
        } return ans;
    }
}