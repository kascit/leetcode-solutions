/*
 * Submission: 1740466852
 * Problem: Backspace String Compare (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-19 06:07:26 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean backspaceCompare(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        int l = slen-1, r = tlen-1;
        while (l>=0 && r>=0) {
            int j = 0;
            while(l>=0 && s.charAt(l)=='#'){
                l--;
                j++;
            }
            l-=j;
            if ( l > 0 && s.charAt(l)=='#') continue;
            j=0;
            while(r>=0 && t.charAt(r)=='#'){
                r--;
                j++;
            }
            r-=j;
            if ( r > 0 && t.charAt(r)=='#') continue;

            if(l <= 0 || r <= 0){
                return l <= 0 && r <= 0;
            }
            if (t.charAt(r) != s.charAt(l)) return false;
            l--;
            r--;
        } return true;
    }
}