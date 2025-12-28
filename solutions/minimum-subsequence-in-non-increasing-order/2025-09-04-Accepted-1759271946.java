/*
 * Submission: 1759271946
 * Problem: Minimum Subsequence in Non-Increasing Order (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-04 11:00:08 UTC
 * Runtime: 4 ms
 * Memory: 44.5 MB
 */

class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        reverse(nums);
        int sum = 0;
        for (int n : nums) sum += n;
        sum /= 2;
        for (int n : nums) {
            sum -= n;
            ans.add(n);
            if (sum < 0) break;
        } return ans;
    }

    private void reverse(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int t = nums[l];
            nums[l] = nums[r];
            nums[r] = t;
            l++; r--;
        }
    }
}