/*
 * Submission: 1603578232
 * Problem: Longest Palindromic Substring (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-11 11:05:24 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int max = 1;
        String ans = "";
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = i; j < n; j++) {
                sb.append(s.charAt(j));
                String cur = sb.toString();
                max = ( cur.equals(sb.reverse().toString())  ) ? Math.max(max,sb.length()) : max;
                if (max == sb.length()) ans = cur;
            }
        }
        return ans;
    }
}