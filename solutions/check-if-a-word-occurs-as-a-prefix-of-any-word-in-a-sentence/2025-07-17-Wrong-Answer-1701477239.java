/*
 * Submission: 1701477239
 * Problem: Check If a Word Occurs As a Prefix of Any Word in a Sentence (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-07-17 16:01:57 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int id = sentence.indexOf(" "+searchWord);
        if ( id == -1) {
            id = sentence.indexOf(searchWord);
            if ( id == -1) return -1;
        }
        int count = 1;
        for(int i = 0; i < id + 1; i++){
            if(sentence.charAt(i) == ' ') count++;
        }
        return count;
    }
}