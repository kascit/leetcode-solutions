/*
 * Submission: 1762784230
 * Problem: Longest Uncommon Subsequence I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 15:05:58 UTC
 * Runtime: 0 ms
 * Memory: 41.9 MB
 */

class Solution {
    public int findLUSlength(String a, String b) {
        int[] freq = new int[26];
        int lena = a.length();
        int lenb = b.length();
        if (lena != lenb) {
            return (lena > lenb) ? lena : lenb;
        }
        boolean not = false;
        for (int i = 0; i < lena; i++) {
            int x = a.charAt(i) -'a', y = b.charAt(i)-'a';
            freq[x]++;
            freq[y]--;
            if (!not && x != y) {
                not = true;
            }
        }
        for (int f : freq) {
            if (f != 0) return lena;
        }
        if (not) return lena;
        return -1;
    }
}