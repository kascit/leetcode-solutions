/*
 * Submission: 1746500421
 * Problem: Remove Palindromic Subsequences (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 10:47:24 UTC
 * Runtime: 0 ms
 * Memory: 41.5 MB
 */

class Solution {
    public int removePalindromeSub(String s) {
        if (isPalin(s)) return 1;
        return 2;
    }
    private boolean isPalin(String s) {
        int l = 0, r = s.length() - 1;
        while ( l < r ) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;r--;
        } return true;
    }
}