/*
 * Submission: 1740478871
 * Problem: Backspace String Compare (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-19 06:18:49 UTC
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
            // System.out.println(s.charAt(l) +"   " + t.charAt(r));
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
                if (Math.max(tH,sH) < 1) return false;
                if (sH > 0){
                    sH--;
                    l--;
                }
                if (tH > 0){
                    tH--;
                    r--;
                }
            }
            l--;
            r--;
        } return true;
    }
}