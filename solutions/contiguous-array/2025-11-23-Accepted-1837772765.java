/*
Submission: 1837772765
Status: Accepted
Timestamp: 2025-11-23 15:41:35 UTC
Runtime: 24 ms
Memory: 65.5 MB
*/

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        // m.put(0,-1);
        int prev = 0, ans = 0, n = nums.length;
        for (int i = 0; i<n; i++) {
            prev += ((nums[i] == 0) ? -1 : 1);
            if (prev == 0) ans = Math.max(ans,i+1);
            else if(m.containsKey(prev)) {
                ans = Math.max(ans,i-m.get(prev));
            }
            else m.put(prev,i);
        } return ans;
    }
}