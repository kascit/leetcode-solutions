/*
 * Submission: 1770463300
 * Problem: Frequency of the Most Frequent Element (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-14 11:50:59 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long curSum = 0;
        int len = nums.length, l = 0, ans = 0;
        for (int r = 0; r < len; r++) {
            curSum += nums[r];
            long shouldBe = (r - l + 1) * nums[r];
            while (l < r && curSum + k < shouldBe) {
                curSum -= nums[l];
                l++;
            }
            // System.out.println(l + " r: " + r + " cur:" + curSum + " Should: " + shouldBe);
            ans = Math.max(ans,r - l + 1);
        } return ans;
    }
}