/*
 * Submission: 1602566122
 * Problem: Move Zeroes (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-10 10:19:52 UTC
 * Runtime: 1 ms
 * Memory: 46.2 MB
 */

class Solution {
    // Shift non-zero values as far forward as possible
// Fill remaining space with zeros

public void moveZeroes(int[] nums) {
    if (nums == null || nums.length == 0) return;        

    int insertPos = 0;
    for (int num: nums) {
        if (num != 0) nums[insertPos++] = num;
    }        

    while (insertPos < nums.length) {
        nums[insertPos++] = 0;
    }
}
}