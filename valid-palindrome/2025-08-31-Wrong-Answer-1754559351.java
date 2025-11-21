/*
 * Submission: 1754559351
 * Problem: Valid Palindrome (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-31 09:04:07 UTC
 * Runtime: N/A
 * Memory: N/A
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
            }
        }
        int l = 0, r = sb.length() - 1;
        // System.out.println(sb.toString());
        while (l < r){
            if (sb.charAt(l++) != sb.charAt(r--)) return false;
        } return true;
    }
}