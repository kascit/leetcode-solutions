/*
Submission: 1864290204
Status: Accepted
Timestamp: 2025-12-24 15:23:49 UTC
Runtime: 6 ms
Memory: 46.4 MB
*/

class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0, l = nums.length - 1;
        for(int i = 0; i < k; i++) {
          ans -= nums[i];
          ans += nums[l-i];
        } return ans;
    }
}