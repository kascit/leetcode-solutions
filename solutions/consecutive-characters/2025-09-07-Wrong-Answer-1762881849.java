/*
 * Submission: 1762881849
 * Problem: Consecutive Characters (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-07 16:43:24 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int maxPower(String s) {
        int pow = 1, rp = 1, len = s.length();
        for (int i = 0; i < len - 1; i++) {
            if (rp > pow) pow = rp;
            char cur = s.charAt(i);
            char next = s.charAt(i+1);
            if (cur == next) rp++;
            else rp = 1;
        } return pow;
    }
}