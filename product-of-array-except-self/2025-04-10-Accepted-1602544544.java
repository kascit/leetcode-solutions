/*
 * Submission: 1602544544
 * Problem: Product of Array Except Self (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-10 09:50:17 UTC
 * Runtime: 2 ms
 * Memory: 55.2 MB
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        ans[0] = 1;
        // Calculate prefix products
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int prevSuffix = 1;
        // Calculate suffix products and update ans array
        for (int i = n - 2; i >= 0; i--) {
            prevSuffix *= nums[i + 1];
            ans[i] *= prevSuffix;
        }

        return ans;
    }
}