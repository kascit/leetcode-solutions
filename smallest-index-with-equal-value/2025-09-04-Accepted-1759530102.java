/*
 * Submission: 1759530102
 * Problem: Smallest Index With Equal Value (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-04 15:48:22 UTC
 * Runtime: 1 ms
 * Memory: 44.4 MB
 */

class Solution {
    public int smallestEqual(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if(i%10 == nums[i]) return i;
        } return -1;
    }
}