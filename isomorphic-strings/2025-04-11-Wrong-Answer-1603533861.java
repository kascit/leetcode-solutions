/*
 * Submission: 1603533861
 * Problem: Isomorphic Strings (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-11 09:58:19 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if ( s.length() != t.length() ) return false;
        int[] diff = new int[256];
        for (int i = 0; i < s.length(); i++){
            if (diff[s.charAt(i)] == 0) diff[i] = t.charAt(i);
            else if ( diff[s.charAt(i)] == t.charAt(i)) continue;
            else return false;
        }
        return true;
    }
}