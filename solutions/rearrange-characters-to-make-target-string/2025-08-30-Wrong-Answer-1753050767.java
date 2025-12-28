/*
 * Submission: 1753050767
 * Problem: Rearrange Characters to Make Target String (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-30 04:11:27 UTC
 * Runtime: N/A
 * Memory: N/A
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
            if (sf[i] == 0 || tf[i] == 0) continue;
            c = Math.min(sf[i]/tf[i],c);
        } return c;
    }
}