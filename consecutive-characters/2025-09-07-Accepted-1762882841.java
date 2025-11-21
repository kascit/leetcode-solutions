/*
 * Submission: 1762882841
 * Problem: Consecutive Characters (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 16:44:18 UTC
 * Runtime: 1 ms
 * Memory: 41.8 MB
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
        } if (rp > pow) pow = rp;
        return pow;
    }
}