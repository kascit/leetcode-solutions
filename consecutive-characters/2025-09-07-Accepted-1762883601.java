/*
 * Submission: 1762883601
 * Problem: Consecutive Characters (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 16:44:59 UTC
 * Runtime: 1 ms
 * Memory: 41.9 MB
 */

class Solution {
    public int maxPower(String s) {
        int pow = 1, rp = 1, len = s.length();
        for (int i = 0; i < len - 1; i++) {
            char cur = s.charAt(i);
            char next = s.charAt(i+1);
            if (cur == next) rp++;
            else rp = 1;
            if (rp > pow) pow = rp;
        } return pow;
    }
}