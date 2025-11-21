/*
 * Submission: 1722835463
 * Problem: Length of Last Word (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-04 08:59:02 UTC
 * Runtime: 3 ms
 * Memory: 42.1 MB
 */

class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split("\\s");
        for (int i = words.length - 1; i >= 0; i--){
            int len = words[i].length();
            if (len > 0) return len;
        }
        return 0;
    }
}