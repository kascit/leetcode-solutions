/*
 * Submission: 1738897288
 * Problem: Check if All Characters Have Equal Number of Occurrences (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 18:55:05 UTC
 * Runtime: 1 ms
 * Memory: 41.7 MB
 */

class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        int def = -1;
        for(int f : freq){
            if (f == 0) continue;
            if (def == -1) def = f;
            else if(def != f) return false;
        } return true;
    }
}