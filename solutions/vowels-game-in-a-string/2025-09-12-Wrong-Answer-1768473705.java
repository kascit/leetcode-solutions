/*
 * Submission: 1768473705
 * Problem: Vowels Game in a String (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-12 16:50:23 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean doesAliceWin(String s) {
        int c = 0, len = s.length();
        for (int i = 0; i < len; i++) {
            if (isVowoW(s.charAt(i))) c++;
        }

        return (c&1) == 0 && c > 0 || c == 1;
    }

    private boolean isVowoW(char ch) {
        return switch (ch) {
            case 'a','e','i','o','u','A','E','I','O','U' -> true;
            default -> false;
        };
    }
}