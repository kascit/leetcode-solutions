/*
 * Submission: 1711218207
 * Problem: Reverse Prefix of Word (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-25 16:22:29 UTC
 * Runtime: 0 ms
 * Memory: 41.7 MB
 */

class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);  
        if (idx == -1) {
            return word;            
        }

        StringBuilder sb = new StringBuilder(word.substring(0, idx + 1));
        sb.reverse();
        sb.append(word.substring(idx + 1)); 
        return sb.toString();
    }
}