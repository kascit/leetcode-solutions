/*
 * Submission: 1603550773
 * Problem: Maximum Nesting Depth of the Parentheses (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-11 10:22:39 UTC
 * Runtime: 0 ms
 * Memory: 41.8 MB
 */

class Solution {
    public int maxDepth(String s) {
        int ans = 0;
        int openBrackets = 0;

        for (Character c : s.toCharArray()) {
            if (c == '(') {
                openBrackets++;
            } else if (c == ')') {
                openBrackets--;
            }

            ans = Math.max(ans, openBrackets);
        }

        return ans;
    }
}