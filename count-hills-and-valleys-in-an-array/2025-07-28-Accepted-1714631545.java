/*
 * Submission: 1714631545
 * Problem: Count Hills and Valleys in an Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-28 14:28:36 UTC
 * Runtime: 0 ms
 * Memory: 41.6 MB
 */

class Solution {
    public int countHillValley(int[] nums) {
        int prev = nums[0], cnt = 0;
        boolean isLarge = false, isSmall = false;
        for (int i : nums){
            int cur = i;
            if (cur == prev) continue;
            
            else if (cur > prev){
                if (isSmall) cnt++;
                isLarge = true;
                isSmall = false;
            } else {
                if (isLarge) cnt++;
                isLarge = false;
                isSmall = true;
            }
            prev = cur;
        }
        return cnt;
    }
}