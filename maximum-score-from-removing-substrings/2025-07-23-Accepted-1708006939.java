/*
 * Submission: 1708006939
 * Problem: Maximum Score From Removing Substrings (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-23 04:38:25 UTC
 * Runtime: 52 ms
 * Memory: 45.9 MB
 */

class Solution {
    public int maximumGain(String s, int x, int y) {
        char first, second;
        int big, small;
        if (x > y) {
            first = 'a';
            second = 'b';
            big = x;
            small = y;
        } else {
            first = 'b';
            second = 'a';
            big = y;
            small = x;
        }

        StringBuilder temp = new StringBuilder();
        int score = 0;
        for (char c : s.toCharArray()) {
            if (!temp.isEmpty() && c == second && temp.charAt(temp.length() - 1) == first) {
                temp.deleteCharAt(temp.length() - 1);
                score += big;
            } else {
                temp.append(c);
            }
        }

        StringBuilder finalSb = new StringBuilder();
        for (int i = 0; i < temp.length(); i++) {
            char c = temp.charAt(i);
            if (!finalSb.isEmpty() && c == first && finalSb.charAt(finalSb.length() - 1) == second) {
                finalSb.deleteCharAt(finalSb.length() - 1);
                score += small;
            } else {
                finalSb.append(c);
            }
        }

        return score;
    }
}
