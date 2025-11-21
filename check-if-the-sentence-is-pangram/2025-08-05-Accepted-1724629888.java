/*
 * Submission: 1724629888
 * Problem: Check if the Sentence Is Pangram (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-05 16:31:01 UTC
 * Runtime: 1 ms
 * Memory: 41.7 MB
 */

class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] freq = new int[26];
        for(char c : sentence.toCharArray()){
            freq[c-'a']++;
        }
        for (int i : freq){
            if (i == 0) return false;
        } return true;
    }
}