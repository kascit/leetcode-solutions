/*
 * Submission: 1758085653
 * Problem: Circular Sentence (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 10:23:06 UTC
 * Runtime: 1 ms
 * Memory: 42.2 MB
 */

class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        char prev =  sentence.charAt(sentence.length()-1);
        for (String word : words) {
            if (word.charAt(0) != prev) return false;
            prev = word.charAt(word.length()-1);
        } return true;
    }
}