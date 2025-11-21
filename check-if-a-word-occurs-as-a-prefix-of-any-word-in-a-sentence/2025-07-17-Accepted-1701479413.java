/*
 * Submission: 1701479413
 * Problem: Check If a Word Occurs As a Prefix of Any Word in a Sentence (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-17 16:03:45 UTC
 * Runtime: 0 ms
 * Memory: 41.6 MB
 */

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int id = sentence.indexOf(searchWord);
        if ( id != 0) {
            id = sentence.indexOf(" "+searchWord);
            if ( id == -1) return -1;
        }
        int count = 1;
        for(int i = 0; i < id + 1; i++){
            if(sentence.charAt(i) == ' ') count++;
        }
        return count;
    }
}