/*
 * Submission: 1603532241
 * Problem: Isomorphic Strings (Easy)
 * Status: Compile Error
 * Language: java
 * Timestamp: 2025-04-11 09:55:57 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if ( s.length != t.length ) return false;
        byte[] diff = new byte[256];
        while (i < s.length){
            if (diff[s.charAt(i)] == 0) {diff[i] =  t.charAt(i); i++;}
            else if ( diff[s.charAt(i)] ==  t.charAt(i)) {continue; i++;}
            else return false;
        }
        return true;
    }
}