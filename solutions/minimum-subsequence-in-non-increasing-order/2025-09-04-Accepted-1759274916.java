/*
 * Submission: 1759274916
 * Problem: Minimum Subsequence in Non-Increasing Order (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-04 11:03:56 UTC
 * Runtime: 4 ms
 * Memory: 45 MB
 */

class Solution {
    int sum = 0;
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        reverse(nums);
        // for (int n : nums) sum += n;
        sum /= 2;
        for (int n : nums) {
            sum -= n;
            ans.add(n);
            if (sum < 0) break;
        } return ans;
    }

    private void reverse(int[] nums) {
        int l = 0, r = nums.length - 1;
        boolean extra = (r&1) == 0;
        while (l < r) {
            sum += nums[l] + nums[r];
            int t = nums[l];
            nums[l] = nums[r];
            nums[r] = t;
            l++; r--;
        }
        if (extra) sum+=nums[l];
    }
}