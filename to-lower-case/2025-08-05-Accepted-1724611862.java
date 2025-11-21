/*
 * Submission: 1724611862
 * Problem: To Lower Case (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-05 16:17:55 UTC
 * Runtime: 1 ms
 * Memory: 41.8 MB
 */

class Solution {
    public String toLowerCase(String s) {
        StringBuilder ans = new StringBuilder();
        // System.out.println((int)'a');
        for (char c : s.toCharArray()){
            if (Character.isLetter(c) && c < 'a') ans.append((char)(c+32)); 
            else ans.append(c);
        }
        return ans.toString();
    }
}