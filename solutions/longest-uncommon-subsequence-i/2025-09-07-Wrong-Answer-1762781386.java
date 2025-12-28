/*
 * Submission: 1762781386
 * Problem: Longest Uncommon Subsequence I (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-07 15:02:51 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int findLUSlength(String a, String b) {
        int[] freq = new int[26];
        int lena = a.length();
        int lenb = b.length();
        if (lena != lenb) {
            return (lena > lenb) ? lena : lenb;
        }
        for (int i = 0; i < lena; i++) {
            freq[a.charAt(i)-'a']++;
        }
        for (int i = 0; i < lenb; i++) {
            freq[b.charAt(i)-'a']--;
        }
        for (int f : freq) {
            if (f != 0) return lena;
        }
        return -1;
    }
}