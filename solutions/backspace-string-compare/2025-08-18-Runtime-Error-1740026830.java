/*
 * Submission: 1740026830
 * Problem: Backspace String Compare (Easy)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-08-18 18:44:54 UTC
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
                if(s.charAt(l) != '#') l--;
            }
            while(r>=0 && t.charAt(r) == '#'){
                r--;
                if(t.charAt(r) != '#') r--;
            }
            if (l <= 0 || r <= 0){
                // System.out.println(l +"   "+r);
                if (r <= 0 && l <= 0) {
                    return true;
                } return false;
            }
            if (s.charAt(l) != t.charAt(r)){
                // System.out.println(l +"   "+r);
                return false;
            }
            l--;
            r--;
        } return true;

    }
}