/*
 * Submission: 1753051864
 * Problem: Rearrange Characters to Make Target String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-30 04:13:11 UTC
 * Runtime: 0 ms
 * Memory: 41.3 MB
 */

class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] tf = new int[26];
        int[] sf = new int[26];
        for (char ch : target.toCharArray()) {
            tf[ch-'a']++;
        }
        for (char ch : s.toCharArray()) {
            sf[ch-'a']++;
        }
        int c = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++){
            if (tf[i] == 0) continue;
            if (sf[i] == 0) return 0;
            c = Math.min(sf[i]/tf[i],c);
        } return c;
    }
}