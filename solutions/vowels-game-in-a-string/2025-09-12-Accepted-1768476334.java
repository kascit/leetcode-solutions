/*
 * Submission: 1768476334
 * Problem: Vowels Game in a String (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-12 16:52:46 UTC
 * Runtime: 6 ms
 * Memory: 45.7 MB
 */

class Solution {
    public boolean doesAliceWin(String s) {
        int c = 0, len = s.length();
        for (int i = 0; i < len; i++) {
            if (isVowoW(s.charAt(i))) return true;
        }

        return false;
    }

    private boolean isVowoW(char ch) {
        return switch (ch) {
            case 'a','e','i','o','u'-> true;
            default -> false;
        };
    }
}