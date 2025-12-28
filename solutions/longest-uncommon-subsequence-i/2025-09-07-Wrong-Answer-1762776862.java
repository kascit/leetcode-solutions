/*
 * Submission: 1762776862
 * Problem: Longest Uncommon Subsequence I (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-07 14:57:50 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int findLUSlength(String a, String b) {
        int[] freqa = new int[26];
        int[] freqb = new int[26];
        int lena = a.length();
        int lenb = b.length();
        if (lena != lenb) {
            return (lena > lenb) ? lena : lenb;
        }
        for (int i = 0; i < lena; i++) {
            freqa[a.charAt(i)-'a']++;
        }
        for (int i = 0; i < lenb; i++) {
            freqb[b.charAt(i)-'a']++;
        }
        lena = 0; lenb = 0;
        for (int i = 0; i < 26; i++) {
            int al = freqa[i];
            int bl = freqb[i];
            if (al > bl) {
                lena += al - bl;
            } else lenb += bl - al;
        } int ans = Math.max(lena,lenb);
        return (ans == 0) ? -1: ans;
    }
}