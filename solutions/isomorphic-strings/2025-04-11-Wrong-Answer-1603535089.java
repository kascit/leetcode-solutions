/*
 * Submission: 1603535089
 * Problem: Isomorphic Strings (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-11 09:59:59 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if ( s.length() != t.length() ) return false;
        int[] diff = new int[256];
        for (int i = 0; i < s.length(); i++){
            if (diff[s.charAt(i)] == 0) diff[s.charAt(i)] = t.charAt(i);
            else if ( diff[s.charAt(i)] == t.charAt(i) ) continue;
            else return false;
        }
        return true;
    }
}