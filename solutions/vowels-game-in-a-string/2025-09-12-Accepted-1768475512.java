/*
 * Submission: 1768475512
 * Problem: Vowels Game in a String (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-12 16:52:03 UTC
 * Runtime: 5 ms
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
            case 'a','e','i','o','u','A','E','I','O','U' -> true;
            default -> false;
        };
    }
}