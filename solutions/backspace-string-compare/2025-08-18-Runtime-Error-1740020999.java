/*
 * Submission: 1740020999
 * Problem: Backspace String Compare (Easy)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-08-18 18:39:32 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean backspaceCompare(String s, String t) {
        int l = s.length()-1;
        int r = t.length()-1;
        while(l>=0 && r>=0){
            while(l>=0 && s.charAt(l) == '#'){
                l--;
            }
            while(r>=0 && s.charAt(r) == '#'){
                r--;
            }
            if (l == -1 || r == -1){
                if (r == -1 && l == -1) {
                    return true;
                } return false;
            }
            if (s.charAt(l) != s.charAt(r)){
                return false;
            }
            l--;
            r--;
        } return true;

    }
}