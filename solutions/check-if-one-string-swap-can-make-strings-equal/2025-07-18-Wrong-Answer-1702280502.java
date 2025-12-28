/*
 * Submission: 1702280502
 * Problem: Check if One String Swap Can Make Strings Equal (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-07-18 09:55:28 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;
        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++){
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++){
            if (freq[i] != 0) return false;
        }
        return true;
    }
}