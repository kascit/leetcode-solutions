/*
 * Submission: 1753079264
 * Problem: Min Max Game (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-30 04:51:17 UTC
 * Runtime: 1 ms
 * Memory: 43.1 MB
 */

class Solution {
    public int minMaxGame(int[] nums) {
        int len = nums.length;
        while (len > 1) {
            for (int i = 0; i < len / 2; i++) {
                if (i % 2 == 0) {
                    nums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
                } else {
                    nums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
                }
            }
            len /= 2;
        }
        return nums[0];
    }
}
