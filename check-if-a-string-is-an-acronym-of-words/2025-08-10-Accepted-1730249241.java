/*
 * Submission: 1730249241
 * Problem: Check if a String Is an Acronym of Words (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 15:13:16 UTC
 * Runtime: 2 ms
 * Memory: 44.9 MB
 */

class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            sb.append(word.charAt(0));
        }
        return sb.toString().equals(s);
    }
}