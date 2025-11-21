/*
 * Submission: 1603535820
 * Problem: Isomorphic Strings (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-11 10:01:03 UTC
 * Runtime: 5 ms
 * Memory: 42 MB
 */

class Solution {
    public boolean isIsomorphic(String s, String t) {
    if (s.length() != t.length()) return false;

    int[] mapS = new int[256];
    int[] mapT = new int[256];

    for (int i = 0; i < s.length(); i++) {
        char sc = s.charAt(i);
        char tc = t.charAt(i);

        if (mapS[sc] == 0 && mapT[tc] == 0) {
            mapS[sc] = tc;
            mapT[tc] = sc;
        } else {
            if (mapS[sc] != tc || mapT[tc] != sc) return false;
        }
    }
    return true;
}

}