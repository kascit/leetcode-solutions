/*
 * Submission: 1771681031
 * Problem: Valid Triangle Number (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-15 14:43:04 UTC
 * Runtime: 22 ms
 * Memory: 43.3 MB
 */

class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans = 0, len = nums.length;
        for (int c = 2; c < len; c++) {
            int a = 0;
            int b = c - 1;
            while (a < b) {
                if(nums[a] + nums[b] > nums[c]) {
                    ans += b - a;
                    b--;
                } else {
                    a++;
                }
            }
        }
        return ans;
    }
}