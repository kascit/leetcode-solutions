/*
 * Submission: 1722834211
 * Problem: Length of Last Word (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-04 08:57:46 UTC
 * Runtime: 3 ms
 * Memory: 42.1 MB
 */

class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split("\\s");
        for (int i = words.length - 1; i >= 0; i--){
            if (words[i].length() > 0) return words[i].length();
        }
        return 0;
    }
}