/*
 * Submission: 1731496062
 * Problem: Find if Digit Game Can Be Won (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-11 16:55:04 UTC
 * Runtime: 0 ms
 * Memory: 43.9 MB
 */

class Solution {
    public boolean canAliceWin(int[] nums) {
        int a = 0, b = 0;
        for (int i : nums){
            if (i < 10) a += i;
            else b += i;
        } return a != b;
    }
}