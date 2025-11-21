/*
 * Submission: 1603533292
 * Problem: Isomorphic Strings (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-11 09:57:30 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if ( s.length() != t.length() ) return false;
        byte[] diff = new byte[256];
        for (int i = 0; i < s.length(); i++){
            if (diff[s.charAt(i)] == 0) diff[i] =  (byte) t.charAt(i);
            else if ( diff[s.charAt(i)] ==  (byte) t.charAt(i)) continue;
            else return false;
        }
        return true;
    }
}