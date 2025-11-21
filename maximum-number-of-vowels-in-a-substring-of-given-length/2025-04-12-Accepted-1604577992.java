/*
 * Submission: 1604577992
 * Problem: Maximum Number of Vowels in a Substring of Given Length (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-12 14:24:28 UTC
 * Runtime: 21 ms
 * Memory: 44.9 MB
 */

class Solution {
    public int maxVowels(String s, int k) {
        int c = 0;
        for (int i = 0; i < k; i++){
            c += vow(s.charAt(i));
        }
        int count = c;
        for (int i = 1; i < s.length() - k + 1; i++){
            count = count - vow(s.charAt(i-1)) + vow(s.charAt(i+k-1));
            c = (count > c) ? count : c;
        }
        return c;

    }
    int vow(char ch){
        String vowels = "aeiouAEIOU";
        return (vowels.indexOf(ch) != -1) ? 1 : 0;
    }
}