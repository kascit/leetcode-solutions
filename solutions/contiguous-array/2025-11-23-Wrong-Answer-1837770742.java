/*
Submission: 1837770742
Status: Wrong Answer
Timestamp: 2025-11-23 15:38:47 UTC
Runtime: N/A
Memory: N/A
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
            m.put(prev,i);
        } return ans;
    }
}