/*
 * Submission: 1754560683
 * Problem: Valid Palindrome (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-31 09:05:42 UTC
 * Runtime: 4 ms
 * Memory: 43.6 MB
 */

class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();
        if (len == 1) return true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char cur = s.charAt(i);
            if (Character.isLetter(cur)){
                sb.append(Character.toLowerCase(cur));
            } else if (Character.isDigit(cur)) {
                sb.append(cur);
            }
        }
        int l = 0, r = sb.length() - 1;
        // System.out.println(sb.toString());
        while (l < r){
            if (sb.charAt(l++) != sb.charAt(r--)) return false;
        } return true;
    }
}