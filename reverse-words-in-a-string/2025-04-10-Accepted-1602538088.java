/*
 * Submission: 1602538088
 * Problem: Reverse Words in a String (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-10 09:41:22 UTC
 * Runtime: 6 ms
 * Memory: 43.4 MB
 */

class Solution {
    public String reverseWords(String s) {
        String[] sentence = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for (int i = sentence.length - 1; i >= 0; i--){
            ans.append(sentence[i]);
            if (i != 0) ans.append(" ");
        }
        return ans.toString();
    }
}