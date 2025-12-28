/*
 * Submission: 1759529554
 * Problem: Smallest Index With Equal Value (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-04 15:47:49 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int smallestEqual(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if(i == nums[i]%10) return i;
        } return -1;
    }
}