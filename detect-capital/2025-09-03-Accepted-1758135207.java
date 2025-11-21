/*
 * Submission: 1758135207
 * Problem: Detect Capital (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 11:24:31 UTC
 * Runtime: 0 ms
 * Memory: 42 MB
 */

class Solution {
    public boolean detectCapitalUse(String word) {
        int len = word.length();
        if (len < 2) return true;
        boolean f = word.charAt(0) < 97;
        boolean s = word.charAt(1) < 97;
        for (int i = 2; i < len; i++) {
            if (s) {
                if (word.charAt(i) >= 97) return false;
            } else {
                if (word.charAt(i) < 97) return false;
            }
        }
        return f || !f && !s; 
    }
}