/*
 * Submission: 1731495429
 * Problem: Find if Digit Game Can Be Won (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-11 16:54:36 UTC
 * Runtime: 0 ms
 * Memory: 44 MB
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