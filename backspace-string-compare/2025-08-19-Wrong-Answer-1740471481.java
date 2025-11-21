/*
 * Submission: 1740471481
 * Problem: Backspace String Compare (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-19 06:11:51 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean backspaceCompare(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        int l = slen-1, r = tlen-1;
        int sH = 0, tH = 0;
        while (l>=0 && r>=0) {
            if (s.charAt(l) == '#'){
                l--;
                sH++;
                continue;
            }
            if (t.charAt(r) == '#'){
                r--;
                tH++;
                continue;
            }
            if (t.charAt(r) != s.charAt(l)){
                if (Math.min(tH,sH) < 1) return false;
                tH--;
                sH--;
            }
            l--;
            r--;
        } return true;
    }
}