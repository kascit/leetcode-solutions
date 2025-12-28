/*
 * Submission: 1603543740
 * Problem: Valid Anagram (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-11 10:12:33 UTC
 * Runtime: 5 ms
 * Memory: 42.9 MB
 */

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        //int xorSum = 0;
        int[] frequency = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            //xorSum ^= s.charAt(i) ^ t.charAt(i); // XOR both characters
            frequency[s.charAt(i) - 'a']++; // Increment for s
            frequency[t.charAt(i) - 'a']--; // Decrement for t
        }
        
        //if (xorSum != 0) return false; // If XOR isn't zero, they're not anagrams
        
        for (int freq : frequency) {
            if (freq != 0) return false; // Check frequency counts
        }
        
        return true;
    }
}