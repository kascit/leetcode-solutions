/*
 * Submission: 1603536520
 * Problem: Isomorphic Strings (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-11 10:02:09 UTC
 * Runtime: 6 ms
 * Memory: 42.9 MB
 */

class Solution {
    public boolean isIsomorphic(String s, String t) {
    if (s.length() != t.length()) return false;

    int[] sMap = new int[256];
    int[] tMap = new int[256];

    for (int i = 0; i < s.length(); i++) {
        char sc = s.charAt(i);
        char tc = t.charAt(i);

        if (sMap[sc] != tMap[tc]) return false;

        // Mark the position where the mapping happened (i + 1 to avoid conflict with default 0)
        sMap[sc] = i + 1;
        tMap[tc] = i + 1;
    }
    return true;
}


}