/*
 * Submission: 1724610736
 * Problem: To Lower Case (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-05 16:17:04 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public String toLowerCase(String s) {
        StringBuilder ans = new StringBuilder();
        // System.out.println((int)'a');
        for (char c : s.toCharArray()){
            if (c < 'a') ans.append((char)(c+32)); 
            else ans.append(c);
        }
        return ans.toString();
    }
}