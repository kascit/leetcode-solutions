/*
 * Submission: 1752617897
 * Problem: Check if Array Is Sorted and Rotated (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-29 16:15:58 UTC
 * Runtime: 0 ms
 * Memory: 41.5 MB
 */

class Solution {
    public boolean check(int[] nums) {
        int c = 0, len = nums.length;
        for (int i = 0; i< len; i++) {
            if (nums[i] > nums[(i+1)%len]) c++;
            if (c > 1) return false;
        } return true;
    }
}