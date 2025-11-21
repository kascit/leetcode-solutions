/*
 * Submission: 1740965163
 * Problem: Backspace String Compare (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-19 14:49:09 UTC
 * Runtime: 0 ms
 * Memory: 41.6 MB
 */

class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1, j = t.length() - 1;

        while (i >= 0 || j >= 0) {
            i = getNextValidChar(s, i);
            j = getNextValidChar(t, j);

            // both pointers exhausted
            if (i < 0 && j < 0) return true;

            // only one exhausted
            if (i < 0 || j < 0) return false;

            if (s.charAt(i) != t.charAt(j)) return false;

            i--;
            j--;
        }
        return true;
    }

    private int getNextValidChar(String str, int idx) {
        int skip = 0;
        while (idx >= 0) {
            if (str.charAt(idx) == '#') {
                skip++;
                idx--;
            } else if (skip > 0) {
                skip--;
                idx--;
            } else {
                break;
            }
        }
        return idx;
    }
}
