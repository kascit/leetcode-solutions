/*
 * Submission: 1714632696
 * Problem: Count Hills and Valleys in an Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-28 14:29:33 UTC
 * Runtime: 0 ms
 * Memory: 41.5 MB
 */

class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == nums[i - 1]) continue;


            int j = i + 1;
            while (j < nums.length && nums[j] == nums[i]) j++;

            if (j < nums.length) {
                if (nums[i] > nums[i - 1] && nums[i] > nums[j]) {
                    count++;
                } else if (nums[i] < nums[i - 1] && nums[i] < nums[j]) {
                    count++;
                }
            }
        }

        return count;
    }
}