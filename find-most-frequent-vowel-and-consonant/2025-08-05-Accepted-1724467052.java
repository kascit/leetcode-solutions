/*
 * Submission: 1724467052
 * Problem: Find Most Frequent Vowel and Consonant (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-05 14:22:28 UTC
 * Runtime: 1 ms
 * Memory: 42.8 MB
 */

class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        int v = 0, c= 0;
        for(int i = 0; i < 26; i++){
            if (i == 0 || i == 4 || i == 8 || i == 14 || i == 20) {
                v = Math.max(v,freq[i]);
            } else {
                c = Math.max(c,freq[i]);
            }
            
        } return v + c;

    }
}