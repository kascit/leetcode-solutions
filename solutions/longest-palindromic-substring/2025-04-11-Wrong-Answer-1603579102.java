/*
 * Submission: 1603579102
 * Problem: Longest Palindromic Substring (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-11 11:06:51 UTC
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
                if (isPalindrome(cur) && cur.length() > max) {
                    max = cur.length();
                    ans = cur;
                }
            }
        }
        return ans;
    }
    private boolean isPalindrome(String s) {
    int l = 0, r = s.length() - 1;
    while (l < r) {
        if (s.charAt(l++) != s.charAt(r--)) return false;
    }
    return true;
}

}