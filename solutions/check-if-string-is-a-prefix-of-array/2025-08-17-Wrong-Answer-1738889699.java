/*
 * Submission: 1738889699
 * Problem: Check If String Is a Prefix of Array (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-17 18:47:07 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words){
            sb.append(word);
        }
        return sb.toString().indexOf(s) == 0;
    }
}